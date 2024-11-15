public class Task {
    private String taskName;
    private boolean isCompleted;

    public Task(String taskName) {
        this.taskName = taskName;
        this.isCompleted = false; // Tasks start incomplete
    }

    public String getTaskName() {
        return taskName;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void markCompleted() {
        this.isCompleted = true;
    }

    @Override
    public String toString() {
        return taskName + (isCompleted ? " (Completed)" : " (Incomplete)");
    }
}