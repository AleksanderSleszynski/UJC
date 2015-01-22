package Section_02;

import com.sun.org.apache.xpath.internal.SourceTree;

class Frog{
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setInfo(String name, int age){
        setName(name);
        setAge(age);
    }

    public void getInfo(){
        System.out.println(getAge());
        System.out.println(getName());
    }
}

public class Ex_17 {
    public static void main(String[] args) {
        Frog frog1= new Frog();

        //frog1.name = "Bertie";
        //frog1.age = 1;

        frog1.setName("Bertie");
        frog1.setAge(1);

        System.out.println(frog1.getName());

        Frog frog2 = new Frog();
        frog2.setInfo("Kinia",13);
        frog2.getInfo();


    }
}
