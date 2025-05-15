package task3.removeMiddleMan;

public class Employee {
    private String name;
    private Department department;

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    // Конструктор та інші методи класу...

    public Department getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }
}
