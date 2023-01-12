package day34_Practices.deviceTask;

public abstract class Device {

    public Device(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        if (brand==null || brand.isEmpty()) {
            System.err.println("Brand cannot be null or empty");
            System.exit(1);
        }
        this.brand = brand;

        if (model==null || model.isEmpty()) {
            System.err.println("Model cannot be null or empty");
            System.exit(1);
        }
        this.model = model;
        setPrice(price);
        setColor(color);

        if (size==null) {
            System.err.println("The size cannot be null");
            System.exit(1);
        }
        this.size = size;
        setHasBattery(hasBattery);
        setHasPowerButton(hasPowerButton);
    }

    public final String brand;
    public final String model;
    private double price;
    private String color;
    public final String size;
    private boolean hasBattery;
    private boolean hasPowerButton;

    abstract void turnOn ();
    abstract void turnOff ();

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        if (price<=0) {
            System.err.println("Price cannot be negative or zero");
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color==null || color.isEmpty()) {
            System.err.println("The color cannot be null or empty");
            System.exit(1);
        }
        this.color = color;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
