package task3.removeMiddleMan;

public class Department {
    private String name;
    private Employee manager;

    public Department(String name, Employee manager) {
        this.name = name;
        this.manager = manager;
    }

    // Конструктор та інші методи класу...
    public String getManagerName() {
        return manager.getName();
    }
}
