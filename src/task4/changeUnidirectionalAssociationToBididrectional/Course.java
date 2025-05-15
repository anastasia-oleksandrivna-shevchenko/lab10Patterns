package task4.changeUnidirectionalAssociationToBididrectional;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String title;
    List<Student> students;

    public Course(String title) {
        this.title = title;
        students = new ArrayList<Student>();
    }

    public void addStudents(Student student) {
        students.add(student);
    }

    public void showStudents() {
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
    // Додаткові методи...
}
