package Section_02;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex_40 {
    public static void main(String[] args) {
        File file = new File("text.txt");

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
            bw.write("This is line one");
            bw.write("This is line two");
            bw.newLine();
            bw.write("Last line.");
        } catch (IOException e) {
            System.out.println("Unable to read file " + file.toString());
        }

    }
}
