package zad2_2;

public class CustomTypeCloneable implements  Cloneable{

    String a;
    int b;

    public CustomTypeCloneable(String a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    protected CustomTypeCloneable clone() throws CloneNotSupportedException {
        return (CustomTypeCloneable) super.clone();
    }
}
