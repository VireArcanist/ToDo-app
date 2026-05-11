// TaskManager.java

import java.util.HashMap;
// import HashMap to store tasks with their IDs as keys

public class TaskManager {
    HashMap<Integer, Task> tasks = new HashMap<>();
    int nextId = 1;
//new HashMap to store tasks and an integer to keep track of the next available ID
    public void addTask(String title) {
        Task newTask = new Task(nextId, title);
        tasks.put(nextId, newTask);
        nextId++;
    }
    // Method to add a new task with a given title. It creates a new Task object, adds it to the tasks HashMap, and increments the nextId for the next task.  
    public void showTasks() {
        for (Task task : tasks.values()) {
            System.out.println(task.id + " | " + task.title + " | " + (task.isCompleted ? "✓" : "X"));
        }
    }
    // Method to display all tasks. It iterates through the values of the tasks HashMap and prints the ID, title, and completion status of each task.
}
