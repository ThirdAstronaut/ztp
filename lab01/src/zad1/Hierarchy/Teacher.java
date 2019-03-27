package zad1.Hierarchy;

import org.javamoney.moneta.Money;

import javax.money.MonetaryAmount;

public class Teacher extends Person {

    private MonetaryAmount salary;

    public Teacher(String name, String lastName, Number salary) {
        super(name, lastName);
        this.salary = Money.of(salary, "PLN");
    }

    public void pokazDaneTeacher() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString() + ", Salary: " + salary;
    }

    public void pokazTylkoDaneTeacher() {
        System.out.println("Salary: " + salary);
    }

    public MonetaryAmount getSalary() {
        return salary;
    }
}
