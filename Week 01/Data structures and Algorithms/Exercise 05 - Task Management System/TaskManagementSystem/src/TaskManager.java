public class TaskManager {
    private TaskNode head;

    public void addTask(Task task) {
        TaskNode newNode = new TaskNode(task);
        if (head == null) {
            head = newNode;
        } else {
            TaskNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Task added: " + task.taskName);
    }

    public void traverseTasks() {
        TaskNode current = head;
        if (current == null) {
            System.out.println("No tasks found.");
            return;
        }
        System.out.println("Task List:");
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    public Task searchTask(int taskId) {
        TaskNode current = head;
        while (current != null) {
            if (current.task.taskId == taskId) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    public void deleteTask(int taskId) {
        if (head == null) return;

        if (head.task.taskId == taskId) {
            head = head.next;
            System.out.println("Task with ID " + taskId + " deleted.");
            return;
        }

        TaskNode current = head;
        while (current.next != null && current.next.task.taskId != taskId) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
            System.out.println("Task with ID " + taskId + " deleted.");
        } else {
            System.out.println("Task with ID " + taskId + " not found.");
        }
    }
}
