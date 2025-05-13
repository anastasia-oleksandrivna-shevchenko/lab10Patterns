package task1.order;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Order order = new Order("Іван Петренко");

        // Додавання товарів
        OrderItem item1 = new OrderItem("Ноутбук", 25000.0, 1);
        OrderItem item2 = new OrderItem("Мишка", 500.0, 2);
        OrderItem item3 = new OrderItem("Клавіатура", 1200.0, 1);

        order.addItem(item1);
        order.addItem(item2);
        order.addItem(item3);

        // Виведення інформації про замовлення
        System.out.println("Інформація про замовлення:");
        System.out.println("Клієнт: " + order.getCustomerName());
        System.out.println("Товари:");

        for (OrderItem item : order.getItems()) {
            System.out.printf("- %s: %.2f грн x %d = %.2f грн%n",
                    item.getName(),
                    item.getPrice(),
                    item.getQuantity(),
                    item.getTotalPrice());
        }

        System.out.printf("Загальна вартість: %.2f грн%n", order.getTotalPrice());

        System.out.println("\nОбробка замовлення...");

        PaymentService paymentService = new PaymentService() {
            @Override
            public boolean processPayment(String customerName, double amount) {
                System.out.printf("Обробка оплати для %s на суму %.2f грн... Успішно!%n",
                        customerName, amount);
                return true;
            }
        };


        InventoryService inventoryService = new InventoryService() {
            @Override
            public boolean checkAvailability(List<OrderItem> items) {
                System.out.println("Перевірка наявності товарів... Усі товари в наявності!");
                return true;
            }

            @Override
            public void updateInventory(List<OrderItem> items) {
                System.out.println("Оновлення кількості товарів на складі...");
                for (OrderItem item : items) {
                    System.out.printf("- %s: зменшено на %d шт.%n",
                            item.getName(), item.getQuantity());
                }
            }
        };

        NotificationService notificationService = new NotificationService() {
            @Override
            public void sendOrderConfirmation(Order order) {
                System.out.printf("Відправлено підтвердження замовлення для %s на суму %.2f грн.%n",
                        order.getCustomerName(), order.getTotalPrice());
            }
        };

        // Створення процесора замовлень і обробка замовлення
        OrderProcessor processor = new OrderProcessor(
                paymentService, inventoryService, notificationService);

        boolean result = processor.processOrder(order);

        System.out.println("\nРезультат обробки замовлення: " +
                (result ? "Успішно оброблено!" : "Виникла помилка під час обробки!"));
    }


}
