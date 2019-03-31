import java.util.List;

import static java.util.stream.Collectors.toList;

public class Department implements Cloneable {
    private String symbol;
    private List<Student> students;

    private Department() {
    }

    public Department(String symbol, List<Student> students) {
        this.symbol = symbol;
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }


    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @Override
    protected Department clone() {
        Department clone = new Department();
        clone.symbol = this.symbol;
        clone.students = this.students.stream().map(Student::clone).collect(toList());
        return clone;
    }
}
