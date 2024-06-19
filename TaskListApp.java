import java.util.ArrayList;
import java.util.Scanner;

public class TaskListApp {

    private static ArrayList<String> taskList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Task List App");
            System.out.println("1. Add task");
            System.out.println("2. Remove task");
            System.out.println("3. List tasks");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (option) {
                case 1:
                    addTask();
                    break;
                case 2:
                    removeTask();
                    break;
                case 3:
                    listTasks();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    private static void addTask() {
        System.out.print("Enter a task: ");
        String task = scanner.nextLine();
        taskList.add(task);
        System.out.println("Task added successfully!");
    }

    private static void removeTask() {
        System.out.print("Enter the task number to remove: ");
        int taskNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        if (taskNumber > 0 && taskNumber <= taskList.size()) {
            taskList.remove(taskNumber - 1);
            System.out.println("Task removed successfully!");
        } else {
            System.out.println("Invalid task number. Please try again.");
        }
    }

    private static void listTasks() {
        if (taskList.isEmpty()) {
            System.out.println("No tasks in the list.");
        } else {
            System.out.println("Task List:");
            for (int i = 0; i < taskList.size(); i++) {
                System.out.println((i + 1) + ". " + taskList.get(i));
            }
        }
    }
}