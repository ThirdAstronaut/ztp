public class Class {
    private School school;
    private int numOfStudents;
    private String symbol;

    public Class(int numOfStudents, String symbol, School school) {
    this.numOfStudents = numOfStudents;
    this.symbol = symbol;
    this.school = school;
    }

    public Class(School school) {
        this.school = school;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
