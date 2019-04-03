import java.util.ArrayList;
import java.util.List;

class StudentIT extends Student {

    private List<Task> tasks;

    StudentIT(String name, String lastname) {
        super(name, lastname);
        tasks = new ArrayList<>();
    }

    void toDo() {
        if (tasks.isEmpty()) {
            System.out.println("Nie masz zadań.");
        } else {
            tasks.forEach(Task::displayTask);
        }
    }

    List<Task> getTasks() {
        return tasks;
    }
}
