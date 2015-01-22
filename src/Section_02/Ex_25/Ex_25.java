package Section_02.Ex_25;

/*
    private --- only within same class
    public --- from anywhere
    protected --- same class, subclass and package
    no modifier --- same package only
 */


import Section_02.Ex_25.Word.Plant;

public class Ex_25 {
    public static void main(String[] args) {
        Plant plant = new Plant();

        System.out.println(plant.name);
        System.out.println(plant.ID);

        //Won't work type is private
        //System.out.println(plant.type);

        //size is protected; Main is not in the same package as Plant.
        //Won't work
        //System.out.println(plant.size);


        //Won't work; Main and Plant in diffrent packages, height has package-level visibiliity
        //System.out.println(plant.height);
    }
}
