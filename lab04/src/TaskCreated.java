import java.time.temporal.ChronoUnit;

public class TaskCreated implements TaskState {

    private Task task;

    TaskCreated(Task task) {
        this.task = task;
    }

    @Override
    public void perform() {
        task.setDueDate(task.getCreationDate().plus(2, ChronoUnit.WEEKS));
        System.out.println("Utworzono zadanie. Data oddania: " + task.getDueDate());
    }
}
