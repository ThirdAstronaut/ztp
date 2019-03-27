package zad1.Hierarchy;

public class FormTutor extends Teacher {

    private String classSymbol;
    private int childsNum;

    public FormTutor(String name, String lastName, Number salary, String classSymbol, int childsNum) {
        super(name, lastName, salary);
        this.classSymbol = classSymbol;
        this.childsNum = childsNum;
    }

    public void pokazDaneFormTutor() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString() + ", ClassSymbol: " + classSymbol + ", ChildsNum: " + childsNum;
    }

    public void pokazTylkoDaneFormTutor() {
        System.out.println("ClassSymbol: " + classSymbol + ", ChildsNum: " + childsNum);
    }

    public String getClassSymbol() {
        return classSymbol;
    }

    public int getChildsNum() {
        return childsNum;
    }
}
