package task7.pushDownField;

public class Vehicle {
    protected int loadCapacity;
    public Vehicle(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
    @Override
    public String toString() {
        return "loadCapacity=" + loadCapacity;
    }
}
