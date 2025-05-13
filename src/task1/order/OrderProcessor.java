package task1.order;

class OrderProcessor {
    private PaymentService paymentService;
    private InventoryService inventoryService;
    private NotificationService notificationService;

    public OrderProcessor(PaymentService paymentService,
                          InventoryService inventoryService,
                          NotificationService notificationService) {
        this.paymentService = paymentService;
        this.inventoryService = inventoryService;
        this.notificationService = notificationService;
    }

    public boolean processOrder(Order order) {
        if (!inventoryService.checkAvailability(order.getItems())) {
            return false;
        }

        boolean paymentSuccessful = paymentService.processPayment(
                order.getCustomerName(),
                order.getTotalPrice()
        );

        if (!paymentSuccessful) {
            return false;
        }

        inventoryService.updateInventory(order.getItems());

        notificationService.sendOrderConfirmation(order);

        return true;
    }
}
