package day12_Practices;

public class MethodsPractice {

    public static void main(String[] args) {


        emailDomain("denis.wagner@gmail.com");
        capitalization("dENIs","wagnER");
        monthName(4);
        daysInMonth("dECEMber");
        nameOfTheDay(4);
        eligibleToVote(10,false);
        salary(45,40);
    }
    public static void emailDomain (String email) {

        email = email.substring(email.indexOf("@")+1,email.lastIndexOf("."));

        System.out.println("domain: "+ email);
    }

    public static void capitalization (String str1, String str2) {

        str1 = str1.substring(0,1).toUpperCase() + str1.toLowerCase().substring(1);
        str2 = str2.substring(0,1).toUpperCase() + str2.toLowerCase().substring(1);
        System.out.println(str1+" "+str2);
    }
    public static void monthName (int monthNumber) {

        String str = (monthNumber==1)?"January":(monthNumber==2)?"February":(monthNumber==3)?"March":
                (monthNumber==4)?"April":(monthNumber==5)?"May":(monthNumber==6)?"June":
                        (monthNumber==7)?"July":(monthNumber==8)?"August":(monthNumber==9)?
                                "September":(monthNumber==10)?"October":(monthNumber==11)?
                                "November":(monthNumber==12)?"December":
                                "The number of month is invalid";
        System.out.println(str);
    }
    public static void daysInMonth (String month) {
        boolean b31 = month.equalsIgnoreCase("january") ||
                month.equalsIgnoreCase("march") ||
                month.equalsIgnoreCase("may") ||
                month.equalsIgnoreCase("july") ||
                month.equalsIgnoreCase("august") ||
                month.equalsIgnoreCase("october") ||
                month.equalsIgnoreCase("december");

        boolean b30 = month.equalsIgnoreCase("april") ||
                month.equalsIgnoreCase("june") ||
                month.equalsIgnoreCase("september") ||
                month.equalsIgnoreCase("november");

        boolean b28 = month.equalsIgnoreCase("february");

        if (b31) {
            System.out.println(month.substring(0,1).toUpperCase() +
                    month.substring(1).toLowerCase() + " has 31 days");
        }
        else if (b30) {
            System.out.println(month.substring(0,1).toUpperCase() +
                    month.substring(1).toLowerCase() + " has 30 days");
        }
        else if (b28) {
            System.out.println(month.substring(0,1).toUpperCase() +
                    month.substring(1).toLowerCase() + " has 28 days");
        }
        else {
            System.out.println("wrong month");
        }

    }
    public static void nameOfTheDay (int dayNumber) {
        String day = (dayNumber==1)?"Monday":(dayNumber==2)?"Tuesday":(dayNumber==3)?"Wednesday":
                (dayNumber==4)?"Thursday":(dayNumber==5)?"Friday":(dayNumber==6)?"Saturday":
                        (dayNumber==7)?"Sunday":"Invalid number";
        System.out.println(day);

    }
    public static void eligibleToVote (int age, boolean isAmerican) {
        if (age>=18 && isAmerican) {
            System.out.println("You are eligible to vote");
        }
        else {
            System.out.println("You are NOT eligible to vote");
        }
    }
    public static void salary (double hourlyRate, int weeklyHours) {
        double result = hourlyRate*weeklyHours*52;
        System.out.println("You make "+hourlyRate+" per hour");
        System.out.println("You work "+weeklyHours+" hours in a week");
        System.out.println("Your gross income is $"+result);
    }
}
