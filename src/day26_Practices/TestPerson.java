package day26_Practices;

public class TestPerson {

    public static void main(String[] args) {

        Person p1 = new Person("Mark",33,'M');
        Person p2 = new Person("Fatima",24,'F');

        p1.eat("Apple");
        p1.drink("Juice");
        p1.sleep();

        p2.eat("Noodles");
        p2.drink("Tea");
        p2.sleep();



    }
}
