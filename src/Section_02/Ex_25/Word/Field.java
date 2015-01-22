package Section_02.Ex_25.Word;

public class Field {
    Plant plant = new Plant();

    public Field(){

        //size is protected; Filed is in the same package as Plant.
        System.out.println(plant.size);
    }
}
