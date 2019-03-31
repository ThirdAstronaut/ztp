public class TaskSentState implements TaskState {

    private Task task;

    TaskSentState(Task task) {
        this.task = task;
    }

    @Override
    public void perform() {
        task.setSent(true);
        System.out.println("Zadanie wysłane? " + task.isSent());
    }
}
