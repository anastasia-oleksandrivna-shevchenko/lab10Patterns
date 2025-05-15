package task4.replaceTypeCodeWithState;

public class CompletedStatus implements OrderStatus {
    @Override
    public void next(Order order) {
        System.out.println("Order already completed.");
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Cannot cancel a completed order.");
    }

    @Override
    public String getStatusName() {
        return "Completed";
    }
}

