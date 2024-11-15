import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TodoList {
    private List<Task> tasks;

    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    // 1. Add Task
    public void addTask(String taskName) {
        tasks.add(new Task(taskName));
        System.out.println("Task added: " + taskName);
    }

    // 2. View All Tasks
    public void viewAllTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }
        tasks.forEach(System.out::println);
    }

    // 3. Filter Tasks (Completed or Incomplete)
    public void filterTasks(boolean completed) {
        List<Task> filteredTasks = tasks.stream()
                                         .filter(task -> task.isCompleted() == completed)
                                         .collect(Collectors.toList());
        if (filteredTasks.isEmpty()) {
            System.out.println("No tasks found.");
        } else {
            filteredTasks.forEach(System.out::println);
        }
    }

    // 4. Edit Task
    public void editTask(int index, String newName) {
        if (index >= 0 && index < tasks.size()) {
            Task task = tasks.get(index);
            task.setName(newName);
            System.out.println("Task edited: " + task);
        } else {
            System.out.println("Invalid task index.");
        }
    }

    // 5. Mark Task as Complete
    public void markTaskComplete(int index) {
        if (index >= 0 && index < tasks.size()) {
            Task task = tasks.get(index);
            task.markComplete();
            System.out.println("Task marked as complete: " + task);
        } else {
            System.out.println("Invalid task index.");
        }
    }

    // 6. Delete Task
    public void deleteTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            Task task = tasks.remove(index);
            System.out.println("Task deleted: " + task);
        } else {
            System.out.println("Invalid task index.");
        }
    }
}
