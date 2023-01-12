package day16_Practices;

import day17_Practices.Car;
import day17_Practices.Rectangle;
import day17_Practices.Student;

public class Test {

    public static void main(String[] args) {

        Car car = new Car();



        car.setInfo("Toyota","Corolla",2019,"Metallic",20500);

        System.out.println(car);
        car.start();

        Student student = new Student();
        student.setInfo("Denis",'M',39,"B-28",'A',true);
        System.out.println(student);
        student.study();

        Rectangle rectangle = new Rectangle();
        rectangle.setInfo(20.5,14.7);
        System.out.println(rectangle);
        rectangle.calculateThePerimeter(20.5,14.7);
        rectangle.calculateTheArea(20.5,14.7);




    }
}
