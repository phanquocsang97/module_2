package mvc.mvc_book.book_controller;

import mvc.mvc_book.book_model.Book;
import mvc.mvc_book.book_model.SortByPrice;
import mvc.mvc_book.book_service.BookService;
import mvc.mvc_book.book_service.IBookService;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static mvc.mvc_book.book_repository.BookRepository.bookList;

public class BookController {
    Scanner scanner = new Scanner(System.in);

        private final IBookService bookService = new BookService();
    public void showListBook() {
        do {
            System.out.println("Chọn chức năng :" +
                    "\n1. Display list book" +
                    "\n2. Add new book" +
                    "\n3. Sort List Book By Price" +
                    "\n4. Delete a book " +
                    "\n5. Exit");
            try {
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("Display list book : ");
                        bookService.displayListBook();
                        break;
                    case 2:
                        System.out.println("Add new book : ");
                        bookService.addNewBook();
                        break;
                    case 3:
                        System.out.println("Sort List By Price");
                        bookService.sortByPrice();
                        break;
                    case 4:
                        System.out.println("Delete A Book");
                        bookService.removeBook();
                        break;
                    case 5:
                        System.out.println("Exit Program");
                        System.exit(0);
                }
            }catch (NumberFormatException e){
                System.out.println("Try Again!!");
            }
        } while (true);
    }
}
