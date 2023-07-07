package mvc.mvc_book.book_service;

import mvc.mvc_book.common.Validate;
import mvc.mvc_book.book_model.Book;
import mvc.mvc_book.book_model.SortByPrice;
import mvc.mvc_book.book_repository.BookRepository;
import mvc.mvc_book.book_repository.IBookRepository;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BookService implements IBookService {
    Scanner scanner = new Scanner(System.in);
    private static IBookRepository bookRepository = new BookRepository();

    @Override
    public void displayListBook() {
        List<Book> bookList = bookRepository.displayListBook();
        for (Book book : bookList) {
            System.out.println(book);
        }
    }

    @Override
    public void addNewBook() {
        do {
            try {
                System.out.println("Enter id you want to add : ");
                String idBook = scanner.nextLine();
                if (bookRepository.searchIdBook(idBook) == -1) {
                    System.out.println("Enter name of Book : ");
                    String nameBook = Validate.validateNameBook();
                    System.out.println("Enter author of Book : ");
                    String authorBook = Validate.validateAuthorBook();
                    System.out.println("Enter price of Book : ");
                    int priceBook = Integer.parseInt(scanner.nextLine());
                    Book book = new Book(idBook, nameBook, authorBook, priceBook);
                    bookRepository.addNewBook(book);
                    break;
                } else {
                    System.out.println("Try Again!!");
                }
            }catch (Exception e){
                System.out.println("ID already exist!!");
            }
        }while (true);
    }


    @Override
    public void sortByPrice() {
        System.out.println("Sort List Book By Price");
        System.out.println("Enter 1 for Increasing list ");
        System.out.println("Enter 2 for Decreasing list ");
        int pick = Integer.parseInt(scanner.nextLine());
        List<Book> bookList = bookRepository.displayListBook();
        switch (pick) {
            case 1:
                System.out.println("Increasing List");
                Collections.sort(bookList, new SortByPrice());
                for (Book book : bookList) {
                    System.out.println(book);
                }
                break;
            case 2:
                System.out.println("Dreasing List");
                Collections.reverse(bookList);
                for (Book book : bookList) {
                    System.out.println(book);
                }
                break;
        }
    }
    public void removeBook(){
        int index = searchIdBook();
        if (index == -1){
            System.out.println("Id not exist!!");
        }else {
            bookRepository.remove(index);
        }
    }
    public int searchIdBook(){
        System.out.println("Enter ID : ");
        int id = Integer.parseInt(scanner.nextLine());
        return bookRepository.searchIdBook(String.valueOf(id));
    }
}
