package day26_Practices;

public class Circle {

    public double radius;
    public double diameter;
    public static double pi = Math.PI;

    public Circle(double radius, double diameter) {
        this.radius = radius;
        this.diameter = diameter;
    }

    public double calcArea (double radius) {
        double area = Math.PI*radius*radius;
        return area;
    }
    public double calcPerimeter (double radius) {
        double perimeter = 2*Math.PI*radius;
        return perimeter;
    }
    public void printPI () {
        System.out.println(Math.PI);
    }


    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", PI=" + Math.PI +
                ", Area=" + calcArea(radius) +
                ", Perimeter=" + calcPerimeter(radius) +
                '}';
    }
}
