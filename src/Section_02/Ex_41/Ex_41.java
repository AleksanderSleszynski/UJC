package Section_02.Ex_41;

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}

public class Ex_41 {
    public static void main(String[] args) {

        System.out.println(new Object());

        Person person = new Person(5, "Bob");
        Person person1 = new Person(5, "Bob");

        System.out.println(person.equals(person1));

        Double value1 = 7.2;
        Double value2 = 7.2;

        System.out.println(value1.equals(value2));


        Integer number1 = 6;
        Integer number2 = 6;
        System.out.println(number1.equals(number2));

        String text1 = "Hello";
        String text2 = "Hello";
        System.out.println(text1.equals(text2));
    }
}
