package day04_Practices;

public class SalaryCalculator {

    public static void main(String[] args) {

        String name = "Joshua";
        int hourlyRate = 40;
        double weeklyHours = 45;

        System.out.println("Hello "+name+", your salary is $ "+(hourlyRate*weeklyHours)*52);
    }
}
