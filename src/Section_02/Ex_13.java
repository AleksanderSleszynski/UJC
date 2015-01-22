package Section_02;

class Personn {

    // Instance variables (data or "state"

    String name;
    int age;

    // Class can contain

    // 1. Data
    // 2. Subroutines (methods)

    void speak(){
        //for(int i =0; i<3; i++) {
            System.out.println("My name is: " + name + " and I'm " + age + " years old");
        //}
    }

    void seyHello(){
        System.out.println("Hello there");
    }
}



public class Ex_13 {
    public static void main(String[] args) {

        Personn person1 = new Personn();
        person1.name = "Joe Bloggs";
        person1.age = 37;
        person1.speak();
        person1.seyHello();

        Personn person2 = new Personn();
        person2.name = "Sara Smith";
        person2.age = 20;
        person2.speak();
        person2.seyHello();
        
    }

}
