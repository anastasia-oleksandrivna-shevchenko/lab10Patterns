package task1.order;

import java.util.List;

class OrderPriceCalculator {
    public double calculateTotalPrice(List<OrderItem> items) {
        return items.stream()
                .mapToDouble(OrderItem::getTotalPrice)
                .sum();
    }
}
