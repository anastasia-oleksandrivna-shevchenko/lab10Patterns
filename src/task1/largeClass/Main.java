package task1.largeClass;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Olena Kovalenko", 29, "Female");

        System.out.println("Adding friends...");
        person.getFriendManager().addFriend("Maria");
        person.getFriendManager().addFriend("Iryna");
        person.getFriendManager().addFriend("Tetyana");

        System.out.println("Adding enemies...");
        person.getFriendManager().addEnemy("Anton");
        person.getFriendManager().addEnemy("Victor");

        System.out.println("Adding tasks...");
        person.getTaskManager().addTask("Finish the project");
        person.getTaskManager().addTask("Go to the gym");
        person.getTaskManager().addTask("Buy groceries");
        person.getTaskManager().addTask("Call parents");

        System.out.println("\nInitial information:");
        PersonInfoDisplay display = new PersonInfoDisplay();
        display.displayPersonInfo(person);

        System.out.println("\nMaking changes...");
        System.out.println("- Removing friend 'Maria'");
        person.getFriendManager().removeFriend("Maria");

        System.out.println("- Removing enemy 'Anton'");
        person.getFriendManager().removeEnemy("Anton");

        System.out.println("- Adding new friend 'Oleksandr'");
        person.getFriendManager().addFriend("Oleksandr");

        System.out.println("- Completing task 'Buy groceries'");
        person.getTaskManager().removeTask("Buy groceries");

        System.out.println("- Adding new task 'Fix the computer'");
        person.getTaskManager().addTask("Fix the computer");

        System.out.println("\nUpdated information:");
        display.displayPersonInfo(person);

        System.out.println("\nStatistics:");
        System.out.println("Number of friends: " + person.getFriendManager().getFriends().size());
        System.out.println("Number of enemies: " + person.getFriendManager().getEnemies().size());
        System.out.println("Number of tasks: " + person.getTaskManager().getTasks().size());

        System.out.println("\nTask list:");
        int counter = 1;
        for (String task : person.getTaskManager().getTasks()) {
            System.out.println(counter + ". " + task);
            counter++;
        }

    }
}
