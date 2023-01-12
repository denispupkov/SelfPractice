package day11_Practices;

public class WebsiteAddress {

    public static void main(String[] args) {

        String website = "www.cydeo.edu";

        if (website.startsWith("www.") && (website.endsWith(".com")
                || website.endsWith(".edu") || website.endsWith(".gov"))) {
            System.out.println("The website is valid");
        }else {
            System.out.println("The website is not valid");
        }

    }
}
