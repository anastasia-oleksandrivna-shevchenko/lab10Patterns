package task7.pullUpConstructorBody;

public class Animal {
    private String name;
    private int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "name: " + name + ", age: " + age;
    }
}
