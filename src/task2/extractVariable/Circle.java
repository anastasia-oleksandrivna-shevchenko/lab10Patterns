package task2.extractVariable;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        double area = Math.PI * radius * radius;
        return area;
    }
    public double calculateCircumference() {
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }

    public void printCircleDetails() {
        System.out.println("Circle with radius " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }

    // Інші методи класу...
}
