package task4.replaceTypeCodeWithState;

public interface OrderStatus {
    void next(Order order);
    void cancel(Order order);
    String getStatusName();
}

