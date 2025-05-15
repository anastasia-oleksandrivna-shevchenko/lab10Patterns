package task7.pullUpConstructorBody;

public class Dog extends Animal {
    private String color;
    public Dog(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }
    @Override
    public String toString() {
        return "Dog{" + super.toString() + ", breed=" + color + "}";
    }
}
