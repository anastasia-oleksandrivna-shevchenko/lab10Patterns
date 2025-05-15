package task6;

import task6.ParametrizeMethod.PowerCalculator;
import task6.addParameter.PriceProcessor;
import task6.hideMethod.ReportGenerator;
import task6.introduceParameterObject.User;
import task6.introduceParameterObject.UserManager;
import task6.preserveWholeObject.Person;
import task6.preserveWholeObject.ProcessPerson;
import task6.renameMethod.Calculator;
import task6.replaceConstructorWithFactoryMethod.Car;
import task6.replaceExceptionWithTest.TemperatureConverter;
import task6.replaceParameterWithExplicitMethods.Printer;
import task6.separateQueryFromModifier.Account;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Choose option (1-13)");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        switch (option) {
            case 1:
                System.out.println(new Calculator().calculateMultiplication(4,5));
                break;
            case 2:
                System.out.println(new PriceProcessor().calculateTotalPrice(1000, 2, 5));
                break;
            case 3:
                Account account = new Account(1500);
                account.addCommission();
                System.out.println(account.getBalance());
                break;
            case 4:
                PowerCalculator calculator = new PowerCalculator();
                System.out.println("Square of 5: " + calculator.calculatePower(5, 2));
                System.out.println("Cube of 5: " + calculator.calculatePower(5, 3));
                break;
            case 5:
                Printer printer = new Printer();
                printer.printTextDocument("text.doc");
                printer.printImageDocument("image.jpg");
                break;
            case 7:
                Person person = new Person("Oleksandr", 23, "Chernivtsi");
                new ProcessPerson().process(person);
                break;
            case 8:
                User user = new User("Oleksandr", 23, "olek@gmail.com");
                new UserManager().processUser(user);
                break;
            case 9:
                task6.removeSettingMethod.Person person1 = new task6.removeSettingMethod.Person("Maria", 19);
                System.out.println(person1);
            case 10:
                new ReportGenerator().generateReport();
                break;
            case 11:
                Car myCar = Car.create("Toyota", "Camry", 2022, "Black");
                System.out.println(myCar);
                break;
            case 12:
                try {
                    int result = new task6.replaceErrorCodeWithException.Calculator().divide(10, 0);
                    System.out.println("Результат ділення: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Помилка: " + e.getMessage());
                }
                break;
            case 13:
                Double celsius = new TemperatureConverter().convertToCelsius(-500);
                if (celsius != null) {
                    System.out.println("Температура в градусах Цельсія: " + celsius);
                } else {
                    System.out.println("Обчислення не виконано через некоректне значення.");
                }
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}
