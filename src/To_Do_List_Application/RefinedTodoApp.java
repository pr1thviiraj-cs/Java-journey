
package To_Do_List_Application;

import java.util.Scanner;
import java.util.ArrayList;

public class RefinedTodoApp {

    static final String LINE =
            "==================================================";

    public static void printHeader() {
        System.out.println();
        System.out.println(LINE);
        System.out.println("          T O - D O   L I S T   A P P");
        System.out.println("             Plan it. Do it. Done.");
        System.out.println(LINE);
    }

    public static void printMenu() {
        System.out.println();
        System.out.println("+------------------------------------------------+");
        System.out.println("|                    MAIN MENU                   |");
        System.out.println("+------------------------------------------------+");
        System.out.println("|  [1]  Add a New Task                            |");
        System.out.println("|  [2]  View All Tasks                            |");
        System.out.println("|  [3]  Mark Task as Completed                    |");
        System.out.println("|  [4]  Delete a Task                             |");
        System.out.println("|  [5]  Exit Application                          |");
        System.out.println("+------------------------------------------------+");
    }

    public static void printDivider() {
        System.out.println(LINE);
    }

    public static void addTask(
            Scanner sc, ArrayList<Task> tasks) {

        System.out.println("\n>>> ADD NEW TASK");
        printDivider();

        System.out.print("Enter task title: ");
        String title = sc.nextLine().trim();

        if (title.isEmpty()) {
            System.out.println("[!] Task title cannot be empty.");
            return;
        }

        tasks.add(new Task(title));

        System.out.println();
        printDivider();
        System.out.println("[SUCCESS] Task added successfully!");
        System.out.println("Task: " + title);
        printDivider();
    }

    public static void viewTasks(ArrayList<Task> tasks) {

        System.out.println("\n>>> YOUR TASK LIST");
        printDivider();

        if (tasks.isEmpty()) {
            System.out.println("  Your task list is empty.");
            System.out.println("  Add a task to get started!");
            printDivider();
            return;
        }

        int completedCount = 0;

        for (Task task : tasks) {
            if (task.completed) {
                completedCount++;
            }
        }

        int pendingCount = tasks.size() - completedCount;

        System.out.printf(
                " Total: %d | Completed: %d | Pending: %d%n",
                tasks.size(), completedCount, pendingCount
        );

        printDivider();

        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);

            String status = task.completed
                    ? "[DONE]" : "[TODO]";

            System.out.printf(
                    " %2d. %-30s %s%n",
                    i + 1, task.title, status
            );
        }

        printDivider();
    }

    public static void completeTask(
            Scanner sc, ArrayList<Task> tasks) {

        System.out.println("\n>>> COMPLETE A TASK");
        printDivider();

        if (tasks.isEmpty()) {
            System.out.println("No tasks available to complete.");
            printDivider();
            return;
        }

        viewTasks(tasks);

        System.out.print("Enter task number: ");

        if (!sc.hasNextInt()) {
            System.out.println("[!] Please enter a valid number.");
            sc.nextLine();
            return;
        }

        int number = sc.nextInt();
        sc.nextLine();

        if (number < 1 || number > tasks.size()) {
            System.out.println("[!] Invalid task number.");
            return;
        }

        Task selectedTask = tasks.get(number - 1);

        if (selectedTask.completed) {
            System.out.println("[INFO] This task is already completed.");
        } else {
            selectedTask.completed = true;
            System.out.println();
            printDivider();
            System.out.println("[SUCCESS] Task completed!");
            System.out.println("Task: " + selectedTask.title);
            printDivider();
        }
    }

    public static void deleteTask(
            Scanner sc, ArrayList<Task> tasks) {

        System.out.println("\n>>> DELETE A TASK");
        printDivider();

        if (tasks.isEmpty()) {
            System.out.println("No tasks available to delete.");
            printDivider();
            return;
        }

        viewTasks(tasks);

        System.out.print("Enter task number to delete: ");

        if (!sc.hasNextInt()) {
            System.out.println("[!] Please enter a valid number.");
            sc.nextLine();
            return;
        }

        int number = sc.nextInt();
        sc.nextLine();

        if (number < 1 || number > tasks.size()) {
            System.out.println("[!] Invalid task number.");
            return;
        }

        Task removedTask = tasks.remove(number - 1);

        System.out.println();
        printDivider();
        System.out.println("[SUCCESS] Task deleted successfully!");
        System.out.println("Removed: " + removedTask.title);
        printDivider();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Task> tasks = new ArrayList<>();

        printHeader();

        int choice;

        do {
            printMenu();

            System.out.print("\nChoose an option (1-5): ");

            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                sc.nextLine();
            } else {
                System.out.println(
                        "\n[!] Invalid input. Please enter a number."
                );
                sc.nextLine();
                choice = 0;
                continue;
            }

            switch (choice) {

                case 1:
                    addTask(sc, tasks);
                    break;

                case 2:
                    viewTasks(tasks);
                    break;

                case 3:
                    completeTask(sc, tasks);
                    break;

                case 4:
                    deleteTask(sc, tasks);
                    break;

                case 5:
                    System.out.println();
                    printDivider();
                    System.out.println("   Thank you for using To-Do List App!");
                    System.out.println("          Stay focused. Keep going.");
                    printDivider();
                    break;

                default:
                    System.out.println(
                            "\n[!] Invalid option. Choose between 1 and 5."
                    );
            }

        } while (choice != 5);

        sc.close();
    }
}
