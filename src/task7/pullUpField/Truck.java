package task7.pullUpField;

public class Truck extends Vehicle {
    // Додаткові поля для підкласу Truck
    private int loadCapacity;

    public Truck(String color, int loadCapacity, String model) {
        super(color, model);
        this.loadCapacity = loadCapacity;
    }
    @Override
    public String toString() {
        return super.toString() + " loadCapacity: " + loadCapacity;
    }

}
