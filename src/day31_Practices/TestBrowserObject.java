package day31_Practices;

public class TestBrowserObject {

    public static void main(String[] args) {

        SafariBrowser safariBrowser = new SafariBrowser();

        safariBrowser.openBrowser();
        safariBrowser.closeBrowser();

        ChromeBrowser chromeBrowser = new ChromeBrowser();
        chromeBrowser.openBrowser();
        chromeBrowser.closeBrowser();

    }
}
