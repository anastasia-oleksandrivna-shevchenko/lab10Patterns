package task1.largeClass;

import java.util.ArrayList;
import java.util.List;

class TaskManager {
    private List<String> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        this.tasks.add(task);
    }

    public void removeTask(String task) {
        this.tasks.remove(task);
    }

    public List<String> getTasks() {
        return new ArrayList<>(tasks);
    }
}
