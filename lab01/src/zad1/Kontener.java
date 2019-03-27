package zad1;

import zad1.Hierarchy.Person;

import java.util.ArrayList;
import java.util.List;

public class Kontener<T extends Person> {

    private List<T> list;

    public Kontener() {
        this.list = new ArrayList<T>();
    }

    public List<T> getList() {
        return list;
    }
}
