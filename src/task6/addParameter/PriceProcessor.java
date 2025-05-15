package task6.addParameter;

public class PriceProcessor {
    public double calculateTotalPrice(double price, int quantity, double taxRate) {
        return price * quantity * (1 + taxRate / 100.0);
    }
}
