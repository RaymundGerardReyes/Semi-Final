import java.util.Scanner;

public class TodoListManager {
    private static TaskManager taskManager = new TaskManager();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Task\n2. View Tasks\n3. Delete Task\n4. Mark Task as Complete\n5. View Completed Tasks\n6. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task name: ");
                    String taskName = scanner.nextLine();
                    taskManager.addTask(taskName);
                    break;

                case 2:
                    taskManager.viewTasks();
                    break;

                case 3:
                    System.out.print("Enter task index to delete: ");
                    int deleteIndex = scanner.nextInt();
                    taskManager.deleteTask(deleteIndex);
                    break;

                case 4:
                    System.out.print("Enter task index to mark as complete: ");
                    int completeIndex = scanner.nextInt();
                    taskManager.markTaskAsComplete(completeIndex);
                    break;

                case 5:
                    System.out.println("Completed Tasks:");
                    taskManager.filterTasks(true);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
            }
        }
    }
}
