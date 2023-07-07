package mvc.mvc_book.book_repository;

import mvc.mvc_book.book_model.Book;

import java.util.List;

public interface IBookRepository {
    void addNewBook(Book book);
    List<Book> displayListBook();
    List<Book> sortByPrice(List<Book> bookPriceList);
    int searchIdBook(String id);
    void remove(int index);
}
