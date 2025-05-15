package task4.replaceTypeCodeWithState;

public class Order {
    private OrderStatus status;

    public Order() {
        this.status = new NewStatus();
    }

    public void nextStatus() {
        status.next(this);
    }

    public void cancelOrder() {
        status.cancel(this);
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public String getStatus() {
        return status.getStatusName();
    }
}

