package day07_Practices;

public class Browser {

    public static void main(String[] args) {

        String browserName = "Opera";
        String result = "Invalid Browser Name";

        if (browserName == "Chrome" || browserName == "Firefox" || browserName == "Opera"
                || browserName == "Safari" || browserName == "Edge") {

            if (browserName == "Chrome") {
                result = browserName+" browser is selected";
            }
            else if (browserName == "Firefox") {
                result = browserName+" browser is selected";
            }
            else if (browserName == "Opera") {
                result = browserName+" browser is selected";
            }
            else if (browserName == "Safari") {
                result = browserName+" browser is selected";
            }
            else if (browserName == "Edge") {
                result = browserName+" browser is selected";
            }
        }
        System.out.println(result);
    }
}
