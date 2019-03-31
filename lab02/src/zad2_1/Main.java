package zad2_1;

import zad2_2.Pair;

public class Main {
    public static void main(String... args) {
        try {

            Pair<Integer> integerPair = Pair.class.newInstance();
            integerPair.setFieldFirst(-21);
            integerPair.setFieldSecond(19);

            Pair<String> stringPair = Pair.class.newInstance();
            stringPair.setFieldFirst("Ala");
            stringPair.setFieldSecond("Ola");

            System.out.println("Created object of class:" + integerPair.getClass() + " First value: " + integerPair.getFieldFirst() + " type: " + integerPair.getFieldFirst().getClass().getName());
            System.out.println("Created object of class:" + stringPair.getClass() + " First value: " + stringPair.getFieldFirst() + " type: " + stringPair.getFieldFirst().getClass().getName());

            Pair[] pairArr = new Pair[2];
            pairArr[0] = integerPair;
            pairArr[1] = stringPair;
            for (Pair p : pairArr) {
                System.out.println(p.toString() + "Pair Array");
            }
            /* BŁĄD KOMPPILACJI */
            //Pair<Integer>[] paramArray = new Pair<Integer>[2];

            Pair<Integer>[] paramArray = (Pair<Integer>[]) java.lang.reflect.Array.newInstance(integerPair.getClass(), 5);
            paramArray[0] = integerPair;
            /* Błąd kompilacji */
            //paramArray[2] = (Pair<String>) stringPair;

            System.out.println(paramArray[0].toString());

        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
