package day07_Practices;

public class GradeReport {

    public static void main(String[] args) {

        int score = 100;
        String result = "";

        if (score>0 && score<101) {
            if (score>=90) {
                result = "A";
            }
            else if (score>=80) {
                result = "B";
            }
            else if (score>=70) {
                result="C";
            }
            else if (score>=60) {
                result = "D";
            }
            else {
                result = "F";
            }
            System.out.println("Your Score is "+result);

        }
        else {
            System.out.println("Invalid Score");
        }


    }
}
