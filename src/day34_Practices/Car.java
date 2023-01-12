package day34_Practices;

public abstract class Car {

    private final String make;
    private final String model;
    private final int year;
    private double price;
    private String color;

    public Car(String make, String model, int year, double price, String color) {
        if (make==null || make.isEmpty()) {
            System.err.println("The make cannot be null or empty");
            System.exit(1);
        }

        this.make = make;

        if (model==null || model.isEmpty()) {
            System.err.println("The model cannot be null or empty");
            System.exit(1);
        }
        this.model = model;

        if (year<1886) {
            System.err.println("The car is not invented yet");
            System.exit(1);
        }
        this.year = year;

        if (price<0) {
            System.err.println("The price cannot be negative");
            System.exit(1);
        }
        this.price = price;

        if (color==null || color.isEmpty()) {
            System.err.println("The color cannot be null or empty");
            System.exit(1);
        }
        this.color = color;
    }


    public abstract void start ();
    public abstract void drive ();
    public void stop () {
        System.out.println(make+" "+model+" is stopping");
    }


    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
