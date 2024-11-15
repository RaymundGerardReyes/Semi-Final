public static void deleteTask(int taskIndex) {
    if (taskIndex >= 0 && taskIndex < tasks.size()) {
        tasks.remove(taskIndex);
        System.out.println("Task deleted!");
    } else {
        System.out.println("Invalid task index.");
    }
}
