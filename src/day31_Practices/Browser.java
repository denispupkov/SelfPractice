package day31_Practices;

public class Browser {

    public void openBrowser() {
        System.out.println("opening chrome browser");
    }

    public void closeBrowser() {
        System.out.println("closing chrome browser");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{}";
    }
}
