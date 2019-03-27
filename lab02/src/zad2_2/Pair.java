package zad2_2;

import lombok.ToString;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@ToString
public class Pair<T> implements Cloneable{
    private T fieldFirst;
    private T fieldSecond;

    public Pair() {
    }

    public Pair(T fieldFirst, T fieldSecond) {
        this.fieldFirst = fieldFirst;
        this.fieldSecond = fieldSecond;
    }

    @Override
    public Pair clone() throws CloneNotSupportedException {
        Pair<T> clone = new Pair<>();

        try{
            clone.fieldFirst = (T) this.fieldFirst.getClass().getMethod("clone").invoke(this.fieldFirst);
            clone.fieldSecond = (T) this.fieldSecond.getClass().getMethod("clone").invoke(this.fieldSecond);
        } catch ( NoSuchMethodException e) {
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
}
