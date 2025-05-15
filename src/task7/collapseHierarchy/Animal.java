package task7.collapseHierarchy;

public class Animal {
    private String species;

    public Animal(String species) {
        this.species = species;
    }
    public void eat() {
        System.out.println("The " + species + " is eating.");
    }
    public void sleep() {
        System.out.println("The " + species + " is sleeping.");
    }
    public void makeSound(String sound) {
        System.out.println("The " + species + " is making a sound: " + sound);
    }
}
