// src/TaskManager.java
import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String taskName) {
        Task task = new Task(taskName);
        tasks.add(task);
        System.out.println("Task added: " + taskName);
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i + ". " + tasks.get(i));
        }
    }

    public void deleteTask(int taskIndex) {
        if (taskIndex >= 0 && taskIndex < tasks.size()) {
            tasks.remove(taskIndex);
            System.out.println("Task deleted!");
        } else {
            System.out.println("Invalid task index.");
        }
    }

    public void markTaskAsComplete(int taskIndex) {
        if (taskIndex >= 0 && taskIndex < tasks.size()) {
            tasks.get(taskIndex).markCompleted();
            System.out.println("Task marked as complete!");
        } else {
            System.out.println("Invalid task index.");
        }
    }

    public void filterTasks(boolean showCompleted) {
        boolean found = false;
        for (Task task : tasks) {
            if (task.isCompleted() == showCompleted) {
                System.out.println(task);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No matching tasks found.");
        }
    }
}
