package day28_Practices;

public class Circle {

    private double radius;
    public static double pi;

    public double getRadius() {
        return radius;
    }

    static {
        pi = Math.PI;
    }

    public void setRadius(double radius) {

        if (radius<=0) {
            System.out.println("Radius cannot be 0 or negative");
            System.exit(1);
        }
        this.radius = radius;
    }

    public Circle(double radius) {
        setRadius(radius);
    }

    public double calcArea () {
        double area = pi*radius*radius;
        return area;
    }
    public double calcPerimeter () {
        double perimeter = 2*pi*radius;
        return perimeter;
    }


    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "Area=" + calcArea() +
                "Perimeter=" + calcPerimeter() +
                '}';
    }
}
