package day09_Practices;

import java.util.Scanner;

public class SpeedCheck {

    public static void main(String[] args) {

        double speedLimit = 55;
        double currentSpeed = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your current speed");
        currentSpeed = scan.nextDouble();

        if (currentSpeed>speedLimit) {
            System.out.println("You are driving "+(currentSpeed-speedLimit)+ " mpf over the limit. Slow Down!");
        }

    }
}
