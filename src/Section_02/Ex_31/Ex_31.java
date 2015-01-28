package Section_02.Ex_31;

import java.util.ArrayList;

class Machine {
    @Override
    public String toString() {
        return "I am a Machine";
    }

    public void start(){
        System.out.println("Machine started.");
    }
}

class Camera extends Machine{
    @Override
    public String toString() {
        return "I am a Camera";
    }

    public void snap(){
        System.out.println("Taking photo");
    }
}
public class Ex_31 {

    public static void main(String[] args) {
        ArrayList<Machine> list = new ArrayList<>();

        list.add(new Machine());
        list.add(new Machine());

        ArrayList<Camera> list2 = new ArrayList<>();

        list2.add(new Camera());
        list2.add(new Camera());

        showList(list);
        showList(list2);
    }

    public static void showList(ArrayList<? extends Machine> list){
        for(Machine value: list){
            System.out.println(value);
            value.start();
        }
    }

    public static void showList1(ArrayList<? super Camera> list){
        for(Object value: list){
            System.out.println(value);
        }
    }
}
