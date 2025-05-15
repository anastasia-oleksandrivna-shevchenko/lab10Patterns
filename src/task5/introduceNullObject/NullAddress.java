package task5.introduceNullObject;

public class NullAddress extends Address {

    public NullAddress() {
        super("", ""); // Порожні значення
    }

    @Override
    public String toString() {
        return "No address available";
    }
}