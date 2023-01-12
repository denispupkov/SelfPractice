package day34_Practices.deviceTask;

public class Iphone extends Phone implements Downloadable, AppleApps {

    public Iphone(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    void turnOn() {

    }

    @Override
    void turnOff() {

    }

    @Override
    public void downloadApp() {

    }
}
