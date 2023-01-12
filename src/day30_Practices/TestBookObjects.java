package day30_Practices;

public class TestBookObjects {

    public static void main(String[] args) {

        EBook eBook = new EBook("Ocean","science","James McRoy",15.55,15,250);
        AudioBook audioBook = new AudioBook("Serial Killers","documentary","Stacy Abrams",17.99,65,"criminal");

        eBook.readBook();
        System.out.println(audioBook);
        System.out.println(audioBook.getNarrator());

    }
}
