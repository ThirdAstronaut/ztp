import lombok.Builder;
import lombok.ToString;

import java.time.LocalDate;
/*
@ToString

public class Task {
    private String description;
    private LocalDate dueDate;
    private LocalDate creationDate;
    private String author;
    private MARK mark;

    public void displayTask(){
        System.out.println(toString());
    }

    public String getDescription() {
        return description;
    }

    public Task setDescription(String description) {
        this.description = description;
        return this;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public Task setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public Task setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public Task setAuthor(String author) {
        this.author = author;
        return this;
    }

    public MARK getMark() {
        return mark;
    }

    public Task setMark(MARK mark) {
        this.mark = mark;
        return this;
    }
}*/



import java.time.LocalDate;
import java.util.Date;
@ToString
public class Task {

    private String description;
    private LocalDate dueDate;
    private LocalDate creationDate;
    private String author;
    private MARK mark;
    private boolean isSent;

    private Task(TaskBuilder taskBuilder) {
        this.description = taskBuilder.description;
        this.dueDate = taskBuilder.dueDate;
        this.author = taskBuilder.author;
        this.mark = taskBuilder.mark;
        this.creationDate = taskBuilder.creationDate;
        this.isSent = taskBuilder.isSent;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public String getAuthor() {
        return author;
    }

    public MARK getMark() {
        return mark;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setMark(MARK mark) {
        this.mark = mark;
    }

    public boolean isSent() {
        return isSent;
    }

    public void setSent(boolean sent) {
        isSent = sent;
    }

    public void displayTask(){
        System.out.println(toString());
    }



    public static class TaskBuilder {

        private boolean isSent;
        private String description;
        private LocalDate dueDate;
        private String author;
        private MARK mark;
        private LocalDate creationDate;

        public TaskBuilder description(String description) {
            this.description = description;
            return this;
        }

        public TaskBuilder dueDate(LocalDate date) {
            this.dueDate = date;
            return this;
        }

        public TaskBuilder author(String author) {
            this.author = author;
            return this;
        }

        public TaskBuilder mark(MARK mark) {
            this.mark = mark;
            return this;
        }

        public TaskBuilder creationDate(LocalDate date) {
            this.creationDate = date;
            return this;
        }

        public TaskBuilder isSent(boolean isSent) {
            this.isSent = isSent;
            return this;
        }

        public Task build() {
            return new Task(this);
        }

    }
}
