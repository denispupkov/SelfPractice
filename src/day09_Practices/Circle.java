package day09_Practices;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double radius = 0;
        double area = 0;
        double perimeter = 0;

        System.out.println("Enter radius of the circle");
        radius = scan.nextDouble();
        area = Math.PI*(radius*radius);
        perimeter = 2*Math.PI*radius;

        System.out.println("radius = " + radius);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

        scan.close();


    }
}
