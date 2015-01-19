package Section_02;

/**
 * Created by julian on 19.01.15.
 */
public class Ex_06 {
    public static void main(String[] args) {

        int myInt = 15;

        if(myInt < 10){
            System.out.println("Yes, it's true!");
        } else if(myInt > 20) {
            System.out.println("No, it's false!");
        } else {
            System.out.println("None of the above.");
        }

        int loop = 0;

        while(true){
            System.out.println("Looping: " + loop);

            if(loop == 5){
                break;
            }
            loop++;

            System.out.println("Running");
        }

    }
}
