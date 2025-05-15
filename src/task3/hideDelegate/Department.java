package task3.hideDelegate;

public class Department {
    private String name;
    private Employee manager;

    public Department(String name, Employee manager) {
        this.name = name;
        this.manager = manager;
    }

    public Employee getManager() {
        return manager;
    }

    public String getName() {
        return name;
    }
}
