package mvc.mvc_book.book_model;

import java.util.Comparator;

public class SortByPrice implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
       return o1.getPriceBook() - o2.getPriceBook();
    }
}
