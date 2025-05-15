package task7.pushDownField;

public class Truck extends Vehicle {
    protected String model;
    public Truck(int loadCapacity, String model) {
        super(loadCapacity);
        this.model = model;
    }
    @Override
    public String toString() {
        return super.toString() + " model=" + model;
    }
}
