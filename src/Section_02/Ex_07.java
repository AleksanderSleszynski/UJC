package Section_02;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by julian on 19.01.15.
 */
public class Ex_07 {
    public static void main(String[] args) {

        //Create scanner object
        Scanner input = new Scanner(System.in);

        //Output the prompt
        System.out.println("Enter a line of text: ");

        //Waiting for the user to enter a line of text
        String line = input.nextLine();

        //Tell them what they entered.
        System.out.println("You entered: " + line);

        int value = input.nextInt();

        System.out.println("You entered: " + value);



    }

}
