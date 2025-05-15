package task7.pullUpField;

public class Vehicle {
    // Поле, яке повторюється в підкласах
    protected String color;
    private String model;

    public Vehicle(String color, String model) {
        this.color = color;
        this.model = model;
    }
    @Override
    public String toString() {
        return "color: " + color + ", model: " + model;
    }
}
