package Section_02;

/**
 * Created by julian on 19.01.15.
 */
public class Ex_03 {
    public static void main(String[] args) {
        int myInt = 7;
        double myDouble = 7.8;

        String text = "Hello";
        String blank= " ";
        String name = "Bob";
        String greeting = text + blank + name;

        System.out.println(greeting);
        System.out.println("Hello" + " " + "Bob");
        System.out.println("My integer is: " + myInt);
        System.out.println("My double is: " + myDouble);
    }
}
