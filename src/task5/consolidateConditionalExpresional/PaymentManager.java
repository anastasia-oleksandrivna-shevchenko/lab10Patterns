package task5.consolidateConditionalExpresional;

public class PaymentManager {

    public void processPayment(double amount, boolean isMember, boolean isDiscountAvailable) {
        if ((amount > 100 && isMember) || (amount > 200 && isDiscountAvailable)) {
            applyDiscount();
        }
        else{
            System.out.println("No discount applied.");
        }
    }
    public void applyDiscount() {
        System.out.println("Discount applied!");
    }
}
