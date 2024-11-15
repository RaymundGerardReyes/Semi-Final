// src/TodoListManager.java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TodoListManager {
    private static List<Task> tasks = new ArrayList<>();

    public static void addTask(String taskName) {
        Task task = new Task(taskName);
        tasks.add(task);
        System.out.println("Task added: " + taskName);
    }

    public static void viewTasks() {
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Task\n2. View Tasks\n3. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task name: ");
                    String taskName = scanner.nextLine();
                    addTask(taskName);
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
            }
        }
    }
}
