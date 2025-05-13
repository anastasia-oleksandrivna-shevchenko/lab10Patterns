package task1.order;

import java.util.ArrayList;
import java.util.List;

class Order {
    private String customerName;
    private List<OrderItem> items;
    private double totalPrice;

    public Order(String customerName) {
        this.customerName = customerName;
        this.items = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    public void addItem(OrderItem item) {
        items.add(item);
        recalculateTotalPrice();
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
        recalculateTotalPrice();
    }

    private void recalculateTotalPrice() {
        this.totalPrice = new OrderPriceCalculator().calculateTotalPrice(items);
    }

    public String getCustomerName() {
        return customerName;
    }

    public List<OrderItem> getItems() {
        return new ArrayList<>(items); // Повертаємо копію для інкапсуляції
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
