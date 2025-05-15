package task4.duplicateObservedData;



public class OrderManager {
    private Order currentOrder;

    public OrderManager(Order order) {
        this.currentOrder = order;
    }

    public void displayOrder() {
        System.out.println("Displaying order: " + currentOrder);
    }

    public void updateQuantity(int newQuantity) {
        currentOrder.setQuantity(newQuantity);
    }
}
