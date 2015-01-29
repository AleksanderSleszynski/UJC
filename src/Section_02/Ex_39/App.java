package Section_02.Ex_39;


import java.io.*;

public class App {
    public static void main(String[] args) {
        //Java 7 style
        File file = new File("test.txt");

            try (BufferedReader br = new BufferedReader(new FileReader(file))){
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }

            } catch (FileNotFoundException e) {
                System.out.println("Can't find file " + file.toString());
            } catch (IOException e) {
                System.out.println("Unable to read file " + file.toString());
            }

    }

}
