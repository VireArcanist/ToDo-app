// Main.java
import java.util.Scanner;
// Main class to run the task manager application
public class Main {
    public static void main(String[] args) {
        // Create an instance of TaskManager to manage tasks
        TaskManager manager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        String input = "";
        // Loop to display the menu and process user input until the user types "exit"
        while (!input.equals("exit")){
            System.out.println("\n1 - Add Task");
            System.out.println("2 - Show Tasks");
            System.out.println("3 - Complete Task");
            System.out.println("4 - Delete Task");
            System.out.println("Type 'exit' to quit");
            System.out.print("Choose an option: ");
            
            input = scanner.nextLine();
            
            // Process user input and call the corresponding methods in TaskManager
            if(input.equals("1")){
                System.out.print("Enter task title: ");
                String title = scanner.nextLine();
                manager.addTask(title);
            } else if (input.equals("2")){
                manager.showTasks();
            } else if (input.equals("3")){
                System.out.print("Enter task ID to complete: ");
                int id = Integer.parseInt(scanner.nextLine());
                manager.completeTask(id);
            } else if (input.equals("4")){
                System.out.print("Enter task ID to delete: ");
                int id = Integer.parseInt(scanner.nextLine());
                manager.deleteTask(id);
            }
        }
        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}