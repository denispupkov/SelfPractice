package day27_Practices;

public class Dog {

    public String breed;
    public String size;
    public char gender;
    public int age;
    public String color;
    public static int numberOfLegs;
    public static int numberOfEyes;
    public static int numberOfWings;
    public boolean isFriendly;

    public Dog(String breed, String size, char gender, int age, String color, boolean isFriendly) {
        this.breed = breed;
        this.size = size;
        this.gender = gender;
        this.age = age;
        this.color = color;
        this.isFriendly = isFriendly;
    }

    static {
        numberOfEyes = 2;
        numberOfLegs = 4;
        numberOfWings = 0;

    }
    public static void eat () {
        System.out.println("The dog is eating");
    }
    public static void drink () {
        System.out.println("The dog is drinking");
    }
    public static void sleep () {
        System.out.println("The dog is sleeping");
    }
    public static void play () {
        System.out.println("The dog is playing");
    }
    public static void bark () {
        System.out.println("The dog is barking");
    }


    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", isFriendly=" + isFriendly +
                '}';
    }
}
