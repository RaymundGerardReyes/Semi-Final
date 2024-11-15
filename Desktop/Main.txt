import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TodoList todoList = new TodoList();

        while (true) {
            System.out.println("\n--- To-Do List ---");
            System.out.println("1. Add Task");
            System.out.println("2. View All Tasks");
            System.out.println("3. Filter Tasks (Completed)");
            System.out.println("4. Filter Tasks (Incomplete)");
            System.out.println("5. Edit Task");
            System.out.println("6. Mark Task as Complete");
            System.out.println("7. Delete Task");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1: // Add Task
                    System.out.print("Enter task name: ");
                    String taskName = scanner.nextLine();
                    todoList.addTask(taskName);
                    break;

                case 2: // View All Tasks
                    todoList.viewAllTasks();
                    break;

                case 3: // Filter Completed Tasks
                    todoList.filterTasks(true);
                    break;

                case 4: // Filter Incomplete Tasks
                    todoList.filterTasks(false);
                    break;

                case 5: // Edit Task
                    System.out.print("Enter task index to edit: ");
                    int editIndex = scanner.nextInt();
                    scanner.nextLine();  // Consume the newline
                    System.out.print("Enter new task name: ");
                    String newName = scanner.nextLine();
                    todoList.editTask(editIndex, newName);
                    break;

                case 6: // Mark Task as Complete
                    System.out.print("Enter task index to mark as complete: ");
                    int completeIndex = scanner.nextInt();
                    todoList.markTaskComplete(completeIndex);
                    break;

                case 7: // Delete Task
                    System.out.print("Enter task index to delete: ");
                    int deleteIndex = scanner.nextInt();
                    todoList.deleteTask(deleteIndex);
                    break;

                case 8: // Exit
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}