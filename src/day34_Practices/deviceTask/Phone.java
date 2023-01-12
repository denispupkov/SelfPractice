package day34_Practices.deviceTask;

public abstract class Phone extends Device {

    public Phone(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    public void call (long phoneNum) {
        System.out.println("The phone is calling to the number "+phoneNum);
    }

    public void text (long phoneNum) {
        System.out.println("The phone is texting to the number "+phoneNum);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
