package day06_Practices;

public class OxygenTank {

    public static void main(String[] args) {

        int tankLevel = 79;
        String message = "";

        if (tankLevel>=90) {
            message="Your Tank Is Full";
        }
        else if (tankLevel>=80) {
            message = "Still OK";
        }
        else if (tankLevel>=70) {
            message = "Don't go too far";
        }
        else if (tankLevel>=60) {
            message = "Start to head back";
        }
        else if (tankLevel>=50) {
            message = "Be Careful Now You At 50%";
        }
        else {
            message = "Don't dive";
        }
        System.out.println(message);
    }
}
