package day06_Practices;

public class AgeGroups {
    public static void main(String[] args) {
        int age = 0;
        String message = "";
        if (age >= 1 && age <= 2) {
            message = "Infant";
        } else if (age >= 3 && age <= 5) {
            message = "Toddler";
        } else if (age >= 6 && age <= 9) {
            message = "Kid";
        } else if (age >= 10 && age <= 12) {
            message = "Pre-Teen";
        } else if (age >= 13 && age <= 17) {
            message = "Teenager";
        } else if (age >= 18 && age <= 20) {
            message = "Young Adult";
        } else if (age >= 21 && age <= 39) {
            message = "Adult";
        } else if (age >= 40 && age <= 49) {
            message = "Young Middle-Aged Adult";
        } else if (age >= 50 && age <= 54) {
            message = "Middle-Aged Adult";
        } else if (age >= 55 && age <= 64) {
            message = "Very Young Senior Citizen";
        } else if (age >= 65 && age <= 74) {
            message = "Young Senior Citizen";
        } else if (age >= 75 && age <= 84) {
            message = "Senior Citizen";
        } else if (age >= 85) {
            message = "Old Senior Citizen";
        } else {
            System.out.println("Choose age between 1-120");
        }
        System.out.println(message);
    }
}