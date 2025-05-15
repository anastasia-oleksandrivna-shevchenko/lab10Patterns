package task2.replaceMethodWithMethodObject;

import task1.order.Order;
import task1.order.OrderItem;

public class OrderProcessor {
    public void processOrder(Order order) {

        OrderProcessorHelper helper = new OrderProcessorHelper(order);
        helper.process();
    }
    // Інші методи класу...

}
