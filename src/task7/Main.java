package task7;

import task7.extractInterface.Rectangle;
import task7.extractInterface.Shape;
import task7.extractInterface.Square;
import task7.extractSuperclass.Employee;
import task7.extractSuperclass.Manager;
import task7.pullUpField.Car;
import task7.pullUpField.Truck;
import task7.pullUpMethod.Animal;
import task7.pullUpMethod.Cat;
import task7.pullUpMethod.Dog;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Choose option (1-8)");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        switch (option) {
            case 1:
                Car car = new Car("black", "model1");
                Truck truck = new Truck("red", 100, "model2");
                System.out.println(car);
                System.out.println(truck);
                break;
            case 2:
                Animal cat = new Cat();
                Animal dog = new Dog();
                cat.makeSound();
                dog.makeSound();
                break;
            case 3:
                task7.pullUpConstructorBody.Animal animal1 = new task7.pullUpConstructorBody.Animal("Animal", 1);
                task7.pullUpConstructorBody.Cat cat1 = new task7.pullUpConstructorBody.Cat("cat", 2, "breed");
                task7.pullUpConstructorBody.Dog dog1 = new task7.pullUpConstructorBody.Dog("dog", 3, "black");
                System.out.println(animal1);
                System.out.println(cat1);
                System.out.println(dog1);
                break;
            case 4:
                new task7.pushDownMethod.Cat().makeSound();
                break;
            case 5:
                System.out.println(new task7.pushDownField.Vehicle(200));
                System.out.println(new task7.pushDownField.Car(100, "brand"));
                System.out.println(new task7.pushDownField.Truck(300, "model"));
                break;
            case 6:
                Employee employee1 = new Employee("employee1", 100.00);
                Manager manager1 = new Manager("manager1", 100.00, "department1");
                employee1.displayDetails();
                manager1.displayDetails();
                break;
            case 7:
                Shape rect = new Rectangle(5, 10);
                Shape square = new Square(4);

                System.out.println("Rectangle area: " + rect.calculateArea());
                System.out.println("Square perimeter: " + square.calculatePerimeter());
                break;
            case 8:
                task7.collapseHierarchy.Animal dog8 = new task7.collapseHierarchy.Animal("dog");
                task7.collapseHierarchy.Animal cat8 = new task7.collapseHierarchy.Animal("cat");
                dog8.eat();
                dog8.sleep();
                dog8.makeSound("woof!");
                cat8.eat();
                cat8.sleep();
                cat8.makeSound("meow!");
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}
