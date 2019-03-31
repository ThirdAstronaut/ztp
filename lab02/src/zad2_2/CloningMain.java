package zad2_2;


public class CloningMain {

    public static void main(String... args) {

        Pair<Boolean> booleanPair = new Pair<>();
        booleanPair.setFieldFirst(true);
        booleanPair.setFieldSecond(false);

        Pair<Long> longPair = new Pair<>();
        longPair.setFieldFirst(1L);
        longPair.setFieldSecond(121221212L);


        Pair<CustomTypeCloneable> customPair = new Pair<>();
        customPair.setFieldFirst(new CustomTypeCloneable("a", 1));
        customPair.setFieldSecond(new CustomTypeCloneable("b", 2));

            //Pair clonedLongPair = (Pair) longPair.clone(longPair);
            //Pair clonedBooleanPair = (Pair) booleanPair.clone(booleanPair);

            Pair clonedBooleanPair = booleanPair.clone();
            Pair clonedLongPair = longPair.clone();
            Pair clonedCustomTypeCloneable = customPair.clone();

            System.out.println("original " + booleanPair.toString());
            booleanPair.setFieldFirst(false);
            System.out.println("cloned " + clonedBooleanPair.toString());
        System.out.println("original " + booleanPair.toString()+"NOWE");

        System.out.println("original " + longPair.toString());
            longPair.setFieldFirst(999999999999L);
            System.out.println("cloned " + clonedLongPair.toString());

            System.out.println("original " + customPair.toString());
            customPair.setFieldFirst(new CustomTypeCloneable("ORYGINAL", -1));
            System.out.println("original " + customPair.toString() + "ORYGINAL PO ZMIANACH");
            System.out.println("cloned " + clonedCustomTypeCloneable.toString() + " CLONE PRZED ZMIANAMI");

    }

}
