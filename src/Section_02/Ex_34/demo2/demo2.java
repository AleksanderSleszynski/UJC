package Section_02.Ex_34.demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class demo2 {
    public static void main(String[] args) {
        try {
            openFile();
        } catch (FileNotFoundException e) {
            //PS. This message is to vague :)
            System.out.println("Could not open file");
        }
    }

    public static void openFile() throws FileNotFoundException {
        File file = new File("test.txt");
        FileReader fr  = new FileReader(file);
    }
}
