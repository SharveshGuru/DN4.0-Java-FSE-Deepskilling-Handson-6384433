public class App {
    public static void main(String[] args) {
        TaskManager tm = new TaskManager();

        tm.addTask(new Task(1, "Design UI", "Pending"));
        tm.addTask(new Task(2, "Develop Backend", "In Progress"));
        tm.addTask(new Task(3, "Test Features", "Pending"));

        tm.traverseTasks();

        System.out.println("\nSearching for Task ID 2:");
        Task task = tm.searchTask(2);
        System.out.println(task != null ? task : "Task not found");

        System.out.println("\nDeleting Task ID 2:");
        tm.deleteTask(2);

        tm.traverseTasks();
    }
}
