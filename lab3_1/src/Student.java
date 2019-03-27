public class Student implements Cloneable {
    private String name;
    private String lastname;

    private Student() {
    }

    public Student(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
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

    @Override
    protected Student clone() {
        Student clone = new Student();
        clone.name = this.name;
        clone.lastname = this.lastname;
        return clone;
    }
}
