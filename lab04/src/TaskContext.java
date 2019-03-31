public class TaskContext {

    private TaskState taskState;

    void setTaskState(TaskState taskState) {
        this.taskState = taskState;
    }

    public TaskState getTaskState() {
        return taskState;
    }

    void request(){
        this.taskState.perform();
    }

}
