import java.util.Random;

public class TaskMarked implements TaskState {
    private Task task;

    TaskMarked(Task task) {
        this.task = task;
    }

    @Override
    public void perform() {
        Mark mark = Mark.values()[new Random().nextInt(Mark.values().length) - 1];
        task.setMark(mark);
        System.out.println("Zadanie ocenione na : " + task.getMark());
    }
}
