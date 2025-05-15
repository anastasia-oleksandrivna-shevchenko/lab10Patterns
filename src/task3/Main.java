package task3;

import task3.hideDelegate.Department;
import task3.hideDelegate.Employee;
import task3.introduceForeignMethod.Client;
import task3.introduceLocalExtension.DateHelper;
import task3.introduceLocalExtension.DateHelperExtended;
import task3.moveMethod.Account;
import task3.moveMethod.Bank;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Choose option (1-5)");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        switch (option) {
            case 1:
                Account acc1 = new Account(1000.0, 5.0);
                Account acc2 = new Account(2000.0, 3.5);
                Account acc3 = new Account(1500.0, 4.0);

                Bank bank = new Bank(Arrays.asList(acc1, acc2, acc3));

                System.out.println("Processing interest for all accounts:");
                bank.processAccounts();
                break;
            case 2:
                task3.hideDelegate.Employee manager = new Employee("Olena Ivanenko", null);
                task3.hideDelegate.Department devDepartment = new Department("Development", manager);
                task3.hideDelegate.Employee employee = new Employee("Ivan Petrenko", devDepartment);

                System.out.println("Manager name: " + employee.getManagerName());
                break;
            case 3:
                task3.removeMiddleMan.Employee manager3 = new task3.removeMiddleMan.Employee("Oleksandr", null);
                task3.removeMiddleMan.Department department = new task3.removeMiddleMan.Department("Development", manager3);
                task3.removeMiddleMan.Employee employee3 = new task3.removeMiddleMan.Employee("Maria", department);

                String managerName = employee3.getDepartment().getManagerName();

                System.out.println("Manager: " + managerName);
                break;
            case 4:
                Client client = new Client();
                client.doSomething();
                break;
            case 5:
                Date today = new Date();
                Date futureDate = DateHelper.addDays(today, 10);

                long daysDiff = DateHelperExtended.daysBetween(today, futureDate);

                System.out.println("Difference in days: " + daysDiff);
        }
    }
}
