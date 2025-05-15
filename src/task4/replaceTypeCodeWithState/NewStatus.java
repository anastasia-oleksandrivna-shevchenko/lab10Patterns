package task4.replaceTypeCodeWithState;

public class NewStatus implements OrderStatus {
    @Override
    public void next(Order order) {
        order.setStatus(new ProcessingStatus());
    }

    @Override
    public void cancel(Order order) {
        order.setStatus(new CancelledStatus());
    }

    @Override
    public String getStatusName() {
        return "New";
    }
}

