public class Student {
    private Class studentsClass;
    private String name;
    private String lastname;

    public Student(Class studentsClass) {
        this.studentsClass = studentsClass;
    }

    public Student(String name, String lastname, Class studentsClass) {
        this.name = name;
        this.lastname = lastname;
        this.studentsClass = studentsClass;
    }

    public Class getStudentsClass() {
        return studentsClass;
    }

    public void setStudentsClass(Class studentsClass) {
        this.studentsClass = studentsClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
