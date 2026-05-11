// TaskManager.java
// import HashMap to store tasks with their IDs as keys
import java.util.HashMap;
//new HashMap to store tasks and an integer to keep track of the next available ID
public class TaskManager {
    HashMap<Integer, Task> tasks = new HashMap<>();
    int nextId = 1;
    // Method to add a new task with a given title. It creates a new Task object, adds it to the tasks HashMap, and increments the nextId for the next task.  
    public void addTask(String title) {
        Task newTask = new Task(nextId, title);
        tasks.put(nextId, newTask);
        nextId++;
    }
    // Method to display all tasks. It iterates through the values of the tasks HashMap and prints the ID, title, and completion status of each task.
    public void showTasks() {
        for (Task task : tasks.values()) {
            System.out.println(task.id + " | " + task.title + " | " + (task.isCompleted ? "✓" : "X"));
        }
    }
    // Method to mark a task as completed. It takes the task ID as an argument and sets the isCompleted property of the corresponding Task object to true.
    public void completeTask(int id) {
        tasks.get(id).isCompleted = true;
    }
    // Method to delete a task. It takes the task ID as an argument and removes the corresponding entry from the tasks HashMap.
    public void deleteTask(int id) {
        tasks.remove(id);
    }
}
