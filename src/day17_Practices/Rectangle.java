package day17_Practices;

public class Rectangle {

    public double length;
    public double width;


    public void calculateTheArea (double length, double width) {
        System.out.println("The area of rectangle is "+length*width);

    }

    public void calculateThePerimeter (double length, double width) {
        System.out.println("The perimeter of rectangle is "+2*(length+width));

    }
    public void setInfo(double length, double width) {
        this.length = length;
        this.width = width;
    }


    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
