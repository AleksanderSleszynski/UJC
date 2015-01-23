package Section_02;

public class Ex_28 {
    public static void main(String[] args) {

        byte byteValue = 20;
        short shortValue = 55;
        int intValue = 888;
        long longValue = 54321;

        float floatValue = 8834.82f;
        float floatValue2 = (float)99.3;
        double doubleValue = 82.4;

        System.out.println(Byte.MAX_VALUE);

        intValue = (int)longValue;
        System.out.println(intValue);

        doubleValue = intValue;
        System.out.println(doubleValue);

        intValue = (int)floatValue;
        System.out.println(intValue);

        //The following won't work as we experct it to!!
        //128 is to big for a byte.
        byteValue = (byte)128;
        System.out.println(byteValue);

    }
}
