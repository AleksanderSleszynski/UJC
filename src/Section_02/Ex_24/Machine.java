package Section_02.Ex_24;


public class Machine implements Info, Startable{

    private int id = 7;

    public void start(){
        System.out.println("Machine started.");
    }

    @Override
    public void stop() {

    }

    @Override
    public void showInfo() {
        System.out.println("Machine id is: " + id);
    }
}
