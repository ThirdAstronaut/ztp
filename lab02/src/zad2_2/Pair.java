package zad2_2;

import lombok.ToString;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

@ToString
public class Pair<T> implements Cloneable, Serializable {
    private T fieldFirst;
    private T fieldSecond;

    public Pair() {
    }

    public Pair(T fieldFirst, T fieldSecond) {
        this.fieldFirst = fieldFirst;
        this.fieldSecond = fieldSecond;
    }

    @Override
    public Pair clone() {
        Pair<T> clone = new Pair<>();

        try {
            clone.fieldFirst = (T) this.fieldFirst.getClass().getMethod("clone").invoke(this.fieldFirst);
            clone.fieldSecond = (T) this.fieldSecond.getClass().getMethod("clone").invoke(this.fieldSecond);
        } catch (NoSuchMethodException e) {
            clone.fieldFirst = this.fieldFirst;
            clone.fieldSecond = this.fieldSecond;
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return clone;
    }

    public T getFieldFirst() {
        return fieldFirst;
    }

    public void setFieldFirst(T fieldFirst) {
        this.fieldFirst = fieldFirst;
    }

    public T getFieldSecond() {
        return fieldSecond;
    }

    public void setFieldSecond(T fieldSecond) {
        this.fieldSecond = fieldSecond;
    }

    /*public static Object clone(Object object) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(object);
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            return ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }*/
}
