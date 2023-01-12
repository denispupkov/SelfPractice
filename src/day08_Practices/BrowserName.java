package day08_Practices;

public class BrowserName {

    public static void main(String[] args) {

        String browserName = "edge";
        String result = "";

        switch (browserName) {
            case "chrome":
                result = "your selected browser is Chrome";
                break;
            case "firefox":
                result = "your selected browser is Firefox";
                break;
            case "opera":
                result = "your selected browser is Opera";
                break;
            case "safari":
                result = "your selected browser is Safari";
                break;
            case "edge":
                result = "your selected browser is Edge";
                break;
            default:
                result = "Invalid Browser";
        }
        System.out.println(result);
    }
}
