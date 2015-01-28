package Section_02.Ex_34.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class demo {
    public static void main(String[] args) {
        File file = new File("text.txt");
        try {
            FileReader fr = new FileReader(file);

            // This will not be executed ig an exception is thrown.
            System.out.println("Continuing ....");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.toString());
        }

        System.out.println("Finished.");
    }
}
