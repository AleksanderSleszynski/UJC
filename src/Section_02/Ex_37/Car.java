package Section_02.Ex_37;

/**
 * Created by julian on 29.01.15.
 */
public class Car extends Machine {
    @Override
    public void start() {
        System.out.println("Starting Car");
    }

    @Override
    public void doStuff() {
        System.out.println("Do stuff in car.");
    }

    @Override
    public void shutDown() {
        System.out.println("Shutdown car.");
    }
}
