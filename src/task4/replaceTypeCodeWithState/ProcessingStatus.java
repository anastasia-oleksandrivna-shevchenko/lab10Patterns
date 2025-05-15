package task4.replaceTypeCodeWithState;

public class ProcessingStatus implements OrderStatus {
    @Override
    public void next(Order order) {
        order.setStatus(new CompletedStatus());
    }

    @Override
    public void cancel(Order order) {
        order.setStatus(new CancelledStatus());
    }

    @Override
    public String getStatusName() {
        return "Processing";
    }
}

