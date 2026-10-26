package To_Do_List_Application;
import java.util.Scanner;
import java.util.ArrayList;

public class TodoApp {

    public static void addTask(
            Scanner sc, ArrayList<Task> tasks) {

        System.out.print("Enter Task Title: ");
        String title = sc.nextLine();

        if (title.trim().isEmpty()) {
            System.out.println("Task title cannot be empty!");
            return;
        }

        tasks.add(new Task(title));
        System.out.println("Task added successfully.");
    }

    public static void viewTasks(ArrayList<Task> tasks) {

        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }

        System.out.println("\nYour Tasks:");

        for (int i = 0; i < tasks.size(); i++) {
            Task t = tasks.get(i);

            String status = t.completed ? "Completed" : "Pending";

            System.out.println((i + 1) + ". " + t.title + " [" + status + "]");
        }
    }

    public static void completeTask(
            Scanner sc, ArrayList<Task> tasks) {

        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }

        viewTasks(tasks);

        System.out.print("Enter task number to complete: ");
        int number = sc.nextInt();

        if (number >= 1 && number <= tasks.size()) {
            Task selectedTask = tasks.get(number - 1);

            if (selectedTask.completed) {
                System.out.println("Task is already completed.");
            } else {
                selectedTask.completed = true;
                System.out.println("Task marked as completed!");
            }
        } else {
            System.out.println("Invalid task number!");
        }
    }

    public static void deleteTask(Scanner sc, ArrayList<Task> tasks) {

        if (tasks.isEmpty()) {
            System.out.println("No tasks available to delete.");
            return;
        }

        viewTasks(tasks);

        System.out.print("Enter task number to delete: ");
        int number = sc.nextInt();

        if (number >= 1 && number <= tasks.size()) {
            Task removedTask = tasks.remove(number - 1);

            System.out.println("Deleted Task: " + removedTask.title);
        } else {
            System.out.println("Invalid task number!");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Task> tasks = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n---------- Welcome to To-Do List Application ----------");
            System.out.println("1. Add Task.");
            System.out.println("2. Show All Tasks.");
            System.out.println("3. Mark Task as Completed.");
            System.out.println("4. Delete Task.");
            System.out.println("5. Exit.");

            System.out.print("Enter Your Choice(1 to 5): ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {


                case 1:
                    addTask(sc, tasks);
                    break;

                case 2:
                    viewTasks(tasks);
                    break;


                case 3:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available.");
                        break;
                    }

                    System.out.print("Enter task number to complete: ");
                    int number = sc.nextInt();

                    if (number >= 1 && number <= tasks.size()) {
                        tasks.get(number - 1).completed = true;

                        System.out.println("Task marked as completed!");
                    } else {
                        System.out.println("Invalid task number!");
                    }
                    break;

                case 4:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available to delete.");
                        break;
                    }

                    System.out.print("Enter task number to delete: ");
                    int deleteNumber = sc.nextInt();

                    if (deleteNumber >= 1
                            && deleteNumber <= tasks.size()) {

                        Task removedTask =
                                tasks.remove(deleteNumber - 1);

                        System.out.println(
                                "Deleted Task: " + removedTask.title
                        );

                    } else {
                        System.out.println("Invalid task number!");
                    }
                    break;

                case 5:
                    System.out.println("Exiting application...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
