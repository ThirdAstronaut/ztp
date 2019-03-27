package zad2_2;

import java.util.ArrayList;
import java.util.List;

public class CustomTypeNotCloneable {

    Object a;
    Integer b;
    List<String> c;

    public CustomTypeNotCloneable() {
        a = new Object();
        b = new Integer(5);
        c = new ArrayList<>();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return null;
    }
}
