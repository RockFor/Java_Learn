/**
 * Created by Гость on 03.02.2016.
 */
class PagePrinter {
    private final int SIZE_OF_PAGES = 32;
    private int numOfPages = 0;
    private int firstPage = 1, lastPage = SIZE_OF_PAGES;

    PagePrinter(int numOfPages) {
        this.numOfPages = numOfPages;
    }
    void PrintPagesInRange() {
        int counter = numOfPages / SIZE_OF_PAGES;
        while(counter-- > 0) {
            System.out.println(firstPage + " - " + lastPage);
            firstPage = lastPage + 1;
            lastPage+=SIZE_OF_PAGES;
        }
    }

}

public class BookPageCounter {
    public static void main(String[] args) {
        PagePrinter printBook1 = new PagePrinter(448);
        printBook1.PrintPagesInRange();
    }
}
