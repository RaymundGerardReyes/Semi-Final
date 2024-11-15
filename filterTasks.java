public static void filterTasks(boolean showCompleted) {
    for (Task task : tasks) {
        if (task.isCompleted() == showCompleted) {
            System.out.println(task);
        }
    }
}
