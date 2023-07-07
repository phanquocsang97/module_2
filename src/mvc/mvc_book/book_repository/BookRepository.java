package mvc.mvc_book.book_repository;

import mvc.mvc_book.book_model.Book;
import mvc.mvc_book.util.WriteAndReadListBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static mvc.mvc_book.book_view.Run.scanner;


public class BookRepository implements IBookRepository {
    private final String BOOK_PATH_FILE = "D:\\CodeGym\\Module 2\\src\\mvc\\mvc_book\\data\\book.csv";
    public static List<Book> bookList = new ArrayList<>();

    @Override
    public void addNewBook(Book book) {
        List<String> stringList = WriteAndReadListBook.readFileBook(BOOK_PATH_FILE);
        stringList.add(book.convertToStringBook());
        WriteAndReadListBook.writeFileBook(BOOK_PATH_FILE, stringList, false);
    }

    @Override
    public List<Book> displayListBook() {
        List<String> stringList = WriteAndReadListBook.readFileBook(BOOK_PATH_FILE);
        String[] info = null;
        for (String s : stringList) {
            info = s.split(",");
            Book book = new Book(info[0], info[1], info[2], Integer.parseInt(info[3]));
            bookList.add(book);
        }
        return bookList;
    }

    @Override
    public List<Book> sortByPrice(List<Book> bookPriceList) {
        bookPriceList = displayListBook();
        return bookPriceList;
    }

    @Override
    public int searchIdBook(String id) {
        bookList = displayListBook();
        int index = -1;
        for (int i = 0; i < bookList.size(); i++) {
            if (Objects.equals(id, bookList.get(i).getIdBook())) {
                index = i;
            }
        }
        return index;
    }

    @Override
    public void remove(int index) {
        String result;
        System.out.println(bookList.get(index));
        System.out.println("Enter yes to delete !!");
        result = scanner.nextLine();
        if (result.equals("yes")){
            bookList.remove(index);
            List<String> stringList = WriteAndReadListBook.readFileBook(BOOK_PATH_FILE);
            stringList.remove(index);
            WriteAndReadListBook.writeFileBook(BOOK_PATH_FILE,stringList,false);
        }else {
            System.out.println("Cancel!!");
        }
    }
}
