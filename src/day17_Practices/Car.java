package day17_Practices;

public class Car {

    public String make;
    public String model;
    public int year;
    public String color;
    public double price;


    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public void setInfo (String make, String model, int year, String color, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }
    public void start () {
        System.out.println(make+" "+model+" is starting");
    }
}

