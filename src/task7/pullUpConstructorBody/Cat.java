package task7.pullUpConstructorBody;

public class Cat extends Animal {
    private String breed;
    public Cat(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    @Override
    public String toString() {
        return "Cat{" + super.toString() + ", breed=" + breed + "}";
    }
}
