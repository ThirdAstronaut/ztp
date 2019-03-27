package zad2_2;

import lombok.ToString;

@ToString
public class CustomTypeCloneable implements  Cloneable{

    private String a;
    private int b;

    public CustomTypeCloneable(String a, int b) {
        this.a = a;
        this.b = b;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    protected CustomTypeCloneable clone() throws CloneNotSupportedException {
        return (CustomTypeCloneable) super.clone();
    }
}
