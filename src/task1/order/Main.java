package task1.order;

import task2.replaceMethodWithMethodObject.Customer;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Ivan Petrenko", false);
        Order order = new Order(customer);

        // Adding items
        OrderItem item1 = new OrderItem("Laptop", 25000.0, 1);
        OrderItem item2 = new OrderItem("Mouse", 500.0, 2);
        OrderItem item3 = new OrderItem("Keyboard", 1200.0, 1);

        order.addItem(item1);
        order.addItem(item2);
        order.addItem(item3);

        // Displaying order information
        System.out.println("Order Information:");
        System.out.println("Customer: " + order.getCustomerName());
        System.out.println("Items:");

        for (OrderItem item : order.getItems()) {
            System.out.printf("- %s: %.2f UAH x %d = %.2f UAH%n",
                    item.getName(),
                    item.getPrice(),
                    item.getQuantity(),
                    item.getTotalPrice());
        }

        System.out.printf("Total Price: %.2f UAH%n", order.getTotalPrice());

        System.out.println("\nProcessing order...");

        PaymentService paymentService = new PaymentService() {
            @Override
            public boolean processPayment(String customerName, double amount) {
                System.out.printf("Processing payment for %s in the amount of %.2f UAH... Successful!%n",
                        customerName, amount);
                return true;
            }
        };

        InventoryService inventoryService = new InventoryService() {
            @Override
            public boolean checkAvailability(List<OrderItem> items) {
                System.out.println("Checking item availability... All items are in stock!");
                return true;
            }

            @Override
            public void updateInventory(List<OrderItem> items) {
                System.out.println("Updating inventory quantities...");
                for (OrderItem item : items) {
                    System.out.printf("- %s: reduced by %d pcs.%n",
                            item.getName(), item.getQuantity());
                }
            }
        };

        NotificationService notificationService = new NotificationService() {
            @Override
            public void sendOrderConfirmation(Order order) {
                System.out.printf("Order confirmation sent to %s for %.2f UAH.%n",
                        order.getCustomerName(), order.getTotalPrice());
            }
        };

        OrderProcessor processor = new OrderProcessor(
                paymentService, inventoryService, notificationService);

        boolean result = processor.processOrder(order);

        System.out.println("\nOrder processing result: " +
                (result ? "Successfully processed!" : "An error occurred during processing!"));
    }
}
