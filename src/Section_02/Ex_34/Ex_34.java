package Section_02.Ex_34;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ex_34 {
    public static void main(String[] args) throws FileNotFoundException {
        File file  = new File("test.txt");

        FileReader fr = new FileReader(file);
    }

}
