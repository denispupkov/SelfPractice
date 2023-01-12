package day07_Practices;

public class WeekDays {

    public static void main(String[] args) {
        int number = 8;
        String result = "";

        if (number>=1 && number<=7) {
            if (number==1) result = "Monday";
            else if (number==2) result = "Tuesday";
            else if (number==3) result = "Wednesday";
            else if (number==4) result = "Thursday";
            else if (number==5) result = "Friday";
            else if (number==6) result = "Saturday";
            else result = "Sunday";
        }
        else {
            System.out.println("Invalid Number");
        }
        System.out.println(result);
    }
}
