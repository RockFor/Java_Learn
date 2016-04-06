package PageSort;

/**
 * Created by Гость on 03.03.2016.
 */
public class PageSorter {
    private final int MAX_PAGES = 32;
    private int numOfPages = 0;
    private int firstBorder = 1, lastBorder = MAX_PAGES;
    public PageSorter() {}
    public PageSorter(int numOfPages) {
        this.numOfPages = numOfPages;
    }
    public void ShowSortedPages() {
        int count = numOfPages / MAX_PAGES;
        while(count--  > 0) {
            System.out.println(firstBorder + " - " + lastBorder);
            firstBorder = lastBorder + 1;
            lastBorder += MAX_PAGES;
        }
    }
}
