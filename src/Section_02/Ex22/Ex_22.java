package Section_02.Ex22;

public class Ex_22 {
    public static void main(String[] args) {
        Machine mach1 = new Machine();

        mach1.start();
        mach1.stop();

        Car car1 = new Car();

        car1.start();
        car1.wipeWindShiled();
        car1.stop();

        car1.showInfo();
    }

}
