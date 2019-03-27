package zad1.Hierarchy;

public class Person {

    private String name;
    private String lastName;

    public Person() {

    }

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public void pokazDanePerson() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Last Name: " + lastName;
    }

    public void pokazTylkoDanePerson() {
        System.out.println("Name: " + name + ", Last Name: " + lastName);
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
}
