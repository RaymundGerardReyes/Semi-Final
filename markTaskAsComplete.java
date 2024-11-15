public static void markTaskAsComplete(int taskIndex) {
    if (taskIndex >= 0 && taskIndex < tasks.size()) {
        tasks.get(taskIndex).markCompleted();
        System.out.println("Task marked as complete!");
    } else {
        System.out.println("Invalid task index.");
    }
}
