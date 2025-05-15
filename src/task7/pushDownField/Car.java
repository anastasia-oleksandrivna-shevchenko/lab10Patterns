package task7.pushDownField;

public class Car extends Vehicle {
    protected String brand;
    public Car(int loadCapacity, String brand) {
        super(loadCapacity);
        this.brand = brand;
    }
    @Override
    public String toString() {
        return super.toString() + " brand=" + brand;
    }
}
