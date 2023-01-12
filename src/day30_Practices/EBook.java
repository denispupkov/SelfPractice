package day30_Practices;

public class EBook extends Book {

    private int size;
    private int pages;

    public EBook(String title, String type, String author, double price, int size, int pages) {
        super(title, type, author, price);
        setSize(size);
        setPages(pages);
    }

    public void readBook () {
        System.out.println("I am reading "+getTitle()+" book");
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if (pages<=0) {
            System.out.println("The number of pages cannot be 0 or negative");
            System.exit(1);
        }
        this.pages = pages;
    }


}
