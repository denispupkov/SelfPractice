package day24_Practices;

import java.time.LocalDate;

public class LeapYear {

    public static void main(String[] args) {


        System.out.println(isLeapYear(1908));

    }

    public static boolean isLeapYear (int birthYear) {

        if (birthYear%4==0) {
            return true;
        }
        else {
            return false;
        }
    }
}
