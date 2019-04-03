import java.time.LocalDate;

public class Main {

    public static void main(String... args) {


        StudentIT student = new StudentIT("Rafał", "Lechowicz");
        student.toDo();
        TaskContext taskContext = new TaskContext();
        Task task = new Task.TaskBuilder().description("Zadanie 4").author("M.Kowalska").creationDate(LocalDate.parse("2019-04-03")).build();

        taskContext.setTaskState(new TaskCreated(task));
        taskContext.request();

        student.getTasks().add(task);
        student.toDo();


        taskContext.setTaskState(new TaskSentState(task));
        taskContext.request();

        taskContext.setTaskState(new TaskMarked(task));
        taskContext.request();

        student.toDo();


    }
}
