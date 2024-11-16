**Main method** resides in the `TodoListManager` class. This class interacts with the user through a console-based menu, offering several functionalities related to managing a to-do list. Here's an analysis of the key functionalities based on the `main` method:

### 1. **Infinite Loop for User Interaction:**
   The `while (true)` loop ensures that the program continues running until the user chooses to exit. It continuously presents the user with options for interacting with the to-do list.

### 2. **Menu Options:**
   The program presents a simple menu with the following choices:
   - **Add Task (Choice 1)**: Allows the user to add a new task by entering the task name.
   - **View Tasks (Choice 2)**: Displays all tasks, showing whether each one is completed or incomplete.
   - **Delete Task (Choice 3)**: Prompts the user to enter the index of the task to delete.
   - **Mark Task as Complete (Choice 4)**: Prompts the user to enter the index of the task they want to mark as complete.
   - **View Completed Tasks (Choice 5)**: Displays only the tasks that have been marked as completed.
   - **Exit (Choice 6)**: Exits the program and closes the scanner.

### 3. **User Input and Interaction:**
   - The program takes user input using the `Scanner` object (`scanner.nextInt()` for numeric input and `scanner.nextLine()` to capture text input after the numeric choice).
   - Based on the user’s choice, it calls specific methods from the `TaskManager` class to perform operations on tasks.

### 4. **TaskManager Integration:**
   The main method relies on the `TaskManager` class to perform the actual operations on the tasks. The `TaskManager` class is responsible for:
   - **Adding tasks**: Adding a task with a given name.
   - **Viewing tasks**: Displaying all tasks, along with their completion status.
   - **Deleting tasks**: Removing a task by its index.
   - **Marking tasks as complete**: Updating a task's completion status.
   - **Filtering tasks**: Displaying tasks that are either completed or incomplete.

### 5. **Termination and Resource Cleanup:**
   - When the user selects **Exit** (Choice 6), the program prints "Exiting..." and gracefully shuts down by closing the scanner using `scanner.close()`.

### Summary of Functionalities:
- **Task Addition**: Allows the user to add tasks.
- **Task Viewing**: Displays all tasks and their completion statuses.
- **Task Deletion**: Deletes tasks based on their index.
- **Task Completion**: Marks a specific task as completed.
- **Filter Completed Tasks**: Displays only tasks that are marked as completed.
- **Exit**: Ends the program.

These functionalities allow the user to manage a to-do list interactively in a terminal-based interface. The `TaskManager` class implements the core logic, while the `TodoListManager` class is responsible for user input and interaction.
