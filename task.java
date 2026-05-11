// Task.java
// Class to represent a task with an ID, title, and completion status
public class Task {
    int id;
    String title;
    boolean isCompleted;
    // Constructor to initialize a new task with an ID and title. The completion status is set to false by default.
    public Task(int id, String title) {
        this.id = id;
        this.title = title;
        this.isCompleted = false;
    }
}
