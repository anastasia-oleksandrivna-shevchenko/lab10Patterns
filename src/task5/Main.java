package task5;

import task5.consolidateConditionalExpresional.PaymentManager;
import task5.decomposeCondition.AccessManager;
import task5.decomposeCondition.Resource;
import task5.decomposeCondition.User;
import task5.introduceAssertion.AverageCalculator;
import task5.introduceNullObject.Address;
import task5.introduceNullObject.Customer;
import task5.removeControlFlag.Searcher;
import task5.replaceConditionalwithPolymorphism.AreaCalculator;
import task5.replaceConditionalwithPolymorphism.Circle;
import task5.replaceConditionalwithPolymorphism.Rectangle;
import task5.replaceNestedConditionalWithGuardClauses.OrderProcceser;

import java.util.Scanner;

import static task5.introduceAssertion.AverageCalculator.calculateAverage;

public class Main {
    public static void main(String[] args) {
        System.out.println("Choose option (1-7)");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                User user = new User("admin");
                Resource report = new Resource("MonthlyReport");

                user.logIn();
                user.grantPermission(report);

                AccessManager accessManager = new AccessManager();
                accessManager.checkAccess(user, report);
                break;
            case 2:
                PaymentManager processor = new PaymentManager();

                System.out.println("Example 1:");
                processor.processPayment(150, true, false);

                System.out.println("Example 2:");
                processor.processPayment(250, false, true);

                System.out.println("Example 3:");
                processor.processPayment(90, false, false);
                break;
            case 3:
                Searcher searcher = new Searcher();
                int[] data = { -5, 10, 22, -3, 1050, 15 };
                searcher.searchElement(data, 1050);
                break;
            case 4:
                OrderProcceser procceser = new OrderProcceser();
                procceser.processOrder(5, 6);
                procceser.processOrder(-1, 10);
                procceser.processOrder(10, -10);
                break;
            case 5:
                Circle circle = new Circle(10);
                Rectangle rectangle = new Rectangle(5,4);
                AreaCalculator calculator = new AreaCalculator();

                System.out.println("Area of a circle " + calculator.calculateArea(circle));
                System.out.println("Area of a rectangle " + calculator.calculateArea(rectangle));
                break;
            case 6:
                Customer c1 = new Customer(new Address("123 Main St", "Kyiv"));
                Customer c2 = new Customer(null); // Без адреси

                System.out.println("Customer 1 address: " + c1.getAddress());
                System.out.println("Customer 2 address: " + c2.getAddress());
                break;
            case 7:
                int[] arr1 = {10, 20, 30};
                int[] arr2 = {};

                System.out.println(calculateAverage(arr1));
                System.out.println(calculateAverage(arr2));
                break;
        }
    }
}
