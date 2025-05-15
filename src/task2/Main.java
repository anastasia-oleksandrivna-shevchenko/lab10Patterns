package task2;

import task1.order.Order;
import task1.order.OrderItem;
import task2.extractMethod.Employee;
import task2.extractMethod.SalaryCalculator;
import task2.extractVariable.Circle;
import task2.inlineTemp.TemperatureConverter;
import task2.removeAssigmentsToParameters.User;
import task2.removeAssigmentsToParameters.UserManager;
import task2.replaceMethodWithMethodObject.Customer;
import task2.replaceMethodWithMethodObject.OrderProcessor;
import task2.replaceTempWithQuary.Item;
import task2.replaceTempWithQuary.ShoppingCart;
import task2.splitTemporaryVariable.LoanCalculator;
import task2.substituteAlgorith.StringManipulator;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Choose option (1-8)");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                Employee employee = new Employee();
                employee.setName("Oleksandr");
                employee.setBaseSalary(1000);
                employee.setOvertimeHours(10);
                employee.setBonusPercentage(5);
                employee.setTaxRate(20);
                employee.printEmployeeInfo();

                SalaryCalculator calculator = new SalaryCalculator();
                double salary = calculator.calculateSalary(employee);
                System.out.println("Total salary: " + salary);
                break;

            case 2:
                Circle circle = new Circle(10);
                circle.printCircleDetails();
                break;
            case 3:
                TemperatureConverter converter = new TemperatureConverter();
                System.out.println(converter.convertToCelsius(100));
                break;
            case 4:
                Item item1 = new Item("Apple", 20.50, 10);
                Item item2 = new Item("Banana", 20.30, 7);
                Item item3 = new Item("Orange", 36.45, 5);

                List<Item> items = Arrays.asList(item1, item2, item3);

                ShoppingCart shoppingCart = new ShoppingCart(items);
                System.out.println("Total price: " + shoppingCart.calculateTotalPrice());
                break;
            case 5:
                LoanCalculator loanCalculator = new LoanCalculator();

                double loanAmount = 10000;
                double annualInterestRate = 5;
                int loanTermYears = 3;

                double totalInterest = loanCalculator.calculateLoanInterest(loanAmount, annualInterestRate, loanTermYears);

                System.out.println("Loan Details:");
                System.out.println("- Loan Amount: $" + loanAmount);
                System.out.println("- Annual Interest Rate: " + annualInterestRate + "%");
                System.out.println("- Loan Term: " + loanTermYears + " years");
                System.out.println("- Total Interest Paid: $" + totalInterest);
                break;
            case 6:
                UserManager manager = new UserManager();

                User originalUser = new User("Alice", false);
                System.out.println("Before adding to manager:");
                System.out.println("- Name: " + originalUser.getName());
                System.out.println("- Registered: " + originalUser.getRegistered());

                manager.addUser(originalUser);

                System.out.println("\nAfter adding to manager:");
                System.out.println("- Original User Registered: " + originalUser.getRegistered());

                System.out.println("\nUsers in manager:");
                for (User u : manager.getUsers()) {
                    System.out.println("- Name: " + u.getName() + ", Registered: " + u.getRegistered());
                }
                break;
            case 7:
                OrderItem item71 = new OrderItem("Laptop", 45000, 1);
                OrderItem item72 = new OrderItem("Mouse", 1750, 3);
                OrderItem item73 = new OrderItem("Phone", 26000, 4);

                List<OrderItem> items7 = Arrays.asList(item71, item72, item73);

                Customer customer = new Customer("Oleksandr", true);
                Order order = new Order(customer, items7);
                OrderProcessor orderProcessor = new OrderProcessor();
                orderProcessor.processOrder(order);

                System.out.println("Order status: " + order.getStatus());
                System.out.println("Total cost: $" + order.getTotalPrice());
                break;
            case 8:
                StringManipulator manipulator = new StringManipulator();

                String input = "Hello, WoRLd! 123 :)";
                String output = manipulator.manipulateString(input);

                System.out.println("Original string:    " + input);
                System.out.println("Manipulated string: " + output);
                break;
            default:
                System.out.println("Invalid option");
        }

    }
}