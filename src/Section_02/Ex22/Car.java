package Section_02.Ex22;


public class Car extends Machine{

    @Override
    public void start() {
        System.out.println("Car started");
    }

    public void wipeWindShiled(){
        System.out.println("Wiping wind shield");
    }

    public void showInfo(){
        System.out.println("Car name: " + name);
    }

}
