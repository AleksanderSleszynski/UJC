package Section_02.Ex_32;

class Machine{
    public void start(){
        System.out.println("Starting machine ...");
    }
}

interface Plant{
    public void grow();
}


public class Ex_32 {
    public static void main(String[] args) {

        Machine machine = new Machine(){
            @Override
            public void start(){
                System.out.println("Camera snaping ... ");
            }
        };

        machine.start();
        Plant plant = new Plant(){
            @Override
            public void grow() {
                System.out.println("Plant growing ... ");
            }
        };

        plant.grow();
    }
}
