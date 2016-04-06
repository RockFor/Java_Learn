package BookPrinter;

/**
 * Created by Гость on 03.03.2016.
 */
import PageSort.*;

public class BookPrint extends PageSorter {
    public static void main(String[] args) {
        PageSorter pS = new PageSorter(490);
        pS.ShowSortedPages();
    }
}
