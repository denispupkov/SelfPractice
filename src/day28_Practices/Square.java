package day28_Practices;

public class Square {

    private double side;

    public Square(double side) {
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side<0) {
            System.out.println("The side of the square should not be negative");
            System.exit(1);
        }
        this.side = side;
    }
    public double calcArea () {
        double area = side*side;
        return area;
    }
    public double calcPerimeter () {
        double perimeter = 4*side;
        return perimeter;
    }


    public String toString() {
        return "Square{" +
                "side=" + side +
                "area=" + calcArea() +
                "perimeter=" + calcPerimeter() +
                '}';
    }
}
