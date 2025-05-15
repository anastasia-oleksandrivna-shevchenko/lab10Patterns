package task1.order;

import task2.replaceMethodWithMethodObject.Customer;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderItem> items;
    private double totalPrice;
    Customer customer;

    private String status = "Pending";

    public Order(Customer customer) {
        this.customer = customer;
        this.items = new ArrayList<>();
        this.totalPrice = 0.0;
    }
    public Order(Customer customer, List<OrderItem> items) {
        this.customer = customer;
        this.items = items;
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
        return customer.getName();
    }

    public List<OrderItem> getItems() {
        return new ArrayList<>(items); // Повертаємо копію для інкапсуляції
    }

    public double getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getItemCount() {
        return items.size();
    }
    public OrderItem getItem(int index) {
        return items.get(index);
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public Customer getCustomer() {
        return customer;
    }
}
