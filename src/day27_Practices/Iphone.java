package day27_Practices;

public class Iphone {

    public String brand;
    public String model;
    public double size;
    public double price;
    public static String OS;
    public static boolean isSmartphone;
    public static String madeIn;
    public static String designedIn;

    public Iphone(String brand, String model, double size, double price) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
    }

    static {
        OS = "iOS";
        isSmartphone = true;
        madeIn = "China";
        designedIn = "California";
    }
    public void printOperatingSystem () {
        System.out.println("Your operating system is: "+OS);
    }

    public void call (long phoneNumber) {
        System.out.println("The number "+phoneNumber+" is calling");
    }

    public void text (long phoneNumber) {
        System.out.println("The number "+phoneNumber+" is texting");
    }
    public void faceTime (long phoneNumber) {
        System.out.println("The number "+phoneNumber+" is using FaceTime");
    }
    public void call (String email) {
        System.out.println("The e-mail "+email+" is calling");
    }


    public String toString() {
        return "Iphone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size=" + size +
                ", price=" + price +
                '}';
    }
}
