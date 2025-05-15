package task4.replaceTypeCodeWithState;

public class CancelledStatus implements OrderStatus {
    @Override
    public void next(Order order) {
        System.out.println("Cannot proceed. Order is cancelled.");
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Order already cancelled.");
    }

    @Override
    public String getStatusName() {
        return "Cancelled";
    }
}

