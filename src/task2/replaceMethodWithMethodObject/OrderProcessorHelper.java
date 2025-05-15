package task2.replaceMethodWithMethodObject;

import task1.order.Order;
import task1.order.OrderItem;

public class OrderProcessorHelper {
    private Order order;
    private double totalPrice;

    public OrderProcessorHelper(Order order) {
        this.order = order;
    }

    public void process() {
        calculateTotalCost();
        applyVipDiscount();
        finalizeOrder();
    }

    private void calculateTotalCost() {
        int itemCount = order.getItemCount();
        for (int i = 0; i < itemCount; i++) {
            OrderItem item = order.getItem(i);
            double itemPrice = item.getPrice();
            int quantity = item.getQuantity();
            totalPrice += itemPrice * quantity;
        }
    }

    private void applyVipDiscount() {
        Customer customer = order.getCustomer();
        if (customer.isVIP()) {
            totalPrice *= 0.9; // 10% off
        }
    }

    private void finalizeOrder() {
        order.setTotalPrice(totalPrice);
        order.setStatus("Processed");
    }
}
