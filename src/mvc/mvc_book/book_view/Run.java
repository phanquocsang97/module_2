package mvc.mvc_book.book_view;

import mvc.mvc_book.book_controller.BookController;
import mvc.mvc_book.book_repository.BookRepository;
import mvc.mvc_book.book_service.BookService;
import mvc.mvc_book.book_service.IBookService;

import java.util.Scanner;

public class Run {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        BookController bookController = new BookController();
        bookController.showListBook();
    }
}
