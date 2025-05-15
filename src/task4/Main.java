package task4;

import task4.changeBidirectionalAssociationToUnidirectional.Department;
import task4.changeBidirectionalAssociationToUnidirectional.Employee;
import task4.changeUnidirectionalAssociationToBididrectional.Course;
import task4.changeUnidirectionalAssociationToBididrectional.Student;
import task4.changeValueToReference.Product;
import task4.duplicateObservedData.Order;
import task4.duplicateObservedData.OrderManager;
import task4.encapsulateCollection.Book;
import task4.encapsulateCollection.Library;
import task4.encapsulateField.Person;
import task4.replaceArrayWithObject.Car;
import task4.replaceArrayWithObject.CarData;
import task4.replaceTypeCodeWithClass.ProductType;
import task4.replaceTypeCodeWithSubclasses.Type1Product;
import task4.replaceTypeCodeWithSubclasses.Type2Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Choose option 1-11");
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        switch (option) {
            case 1:
                Product p1 = new Product("Laptop", 1200.0, "USD");
                Product p2 = new Product("Phone", 800.0, "USD");
                Product p3 = new Product("Book", 30.0, "EUR");

                System.out.println("Currency p1 == p2: " + (p1.getCurrency() == p2.getCurrency())); // true
                System.out.println("Currency p1 == p3: " + (p1.getCurrency() == p3.getCurrency())); // false

                System.out.println(p1.getName() + " | " + p1.getCurrencyCode());
                System.out.println(p2.getName() + " | " + p2.getCurrencyCode());
                System.out.println(p3.getName() + " | " + p3.getCurrencyCode());
                break;
            case 2:
                Car car1 = new Car("Toyota Camry", 27000.0, 2021);
                Car car2 = new Car("BMW X5", 55000.0, 2023);
                Car car3 = new Car("Honda Civic", 22000.0, 2020);

                List<Car> cars = Arrays.asList(car1, car2, car3);

                CarData carData = new CarData(cars);
                carData.printCars();
                break;
            case 3:
                Order order = new Order("John Doe", "Laptop", 2);
                OrderManager manager = new OrderManager(order);

                manager.displayOrder();
                manager.updateQuantity(3);
                manager.displayOrder();
                break;
            case 4:
                Course course = new Course("Design patterns");
                Student student1 = new Student("Oleksandr");
                Student student2 = new Student("Maria");
                student1.enrollCourse(course);
                student2.enrollCourse(course);
                course.showStudents();
                break;
            case 5:
                Employee emp1 = new Employee("Ivan");
                Employee emp2 = new Employee("Olena");
                Employee emp3 = new Employee("Petro");

                List<Employee> employees = new ArrayList<>();
                employees.add(emp1);
                employees.add(emp2);
                employees.add(emp3);

                Department department = new Department("Development", employees);

                System.out.println("Department: " + department.getName());
                System.out.println("Employees:");
                for (Employee e : department.getEmployees()) {
                    System.out.println("- " + e.getName());
                }
                break;
            case 7:
                Person person = new Person(17);
                System.out.println(person.getAge());
                person.setAge(18);
                System.out.println(person.getAge());
            case 8:
                Book book1 = new Book("book1");
                Book book2 = new Book("book2");
                List<Book> books = Arrays.asList(book1, book2);
                Library library = new Library(books);
                for(Book b: library.getBooks()) {
                    System.out.println(b);
                }
                break;
            case 9:
                ProductType electronics = new ProductType("Electronics");
                ProductType furniture = new ProductType("Furniture");

                task4.replaceTypeCodeWithClass.Product p91 = new task4.replaceTypeCodeWithClass.Product(electronics, "Smartphone");
                task4.replaceTypeCodeWithClass.Product p92 = new task4.replaceTypeCodeWithClass.Product(furniture, "Chair");

                System.out.println(p91.getName() + " is of type " + p91.getType());
                System.out.println(p92.getName() + " is of type " + p92.getType());
                break;
            case 10:
                task4.replaceTypeCodeWithSubclasses.Product p101 = new Type1Product("Smartphone");
                task4.replaceTypeCodeWithSubclasses.Product p102 = new Type2Product("Chair");

                p101.process();
                p102.process();
                break;
            case 11:
                task4.replaceTypeCodeWithState.Order order1 = new task4.replaceTypeCodeWithState.Order();
                System.out.println("Current: " + order1.getStatus());

                order1.nextStatus();
                System.out.println("Current: " + order1.getStatus());

                order1.cancelOrder();
                System.out.println("Current: " + order1.getStatus());

                order1.nextStatus();
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}
