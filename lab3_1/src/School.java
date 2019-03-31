import java.io.Serializable;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class School implements Cloneable, Serializable {

    private String name;
    private List<Department> departments;

    private School() {
    }

    public School(String name, List<Department> departments) {
        this.name = name;
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public School clone() throws CloneNotSupportedException {
        School school = (School) super.clone();
        school.name = this.name;
        school.departments = this.departments.stream().map(Department::clone).collect(toList());
        return school;
    }
}
