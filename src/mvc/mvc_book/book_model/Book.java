package mvc.mvc_book.book_model;

import java.util.Comparator;

public class Book {
    private String idBook;
    private String nameBook;
    private String authorBook;
    private int priceBook;

    public Book() {
    }

    public Book(String idBook, String nameBook, String authorBook, int priceBook) {
        this.idBook = idBook;
        this.nameBook = nameBook;
        this.authorBook = authorBook;
        this.priceBook = priceBook;
    }

    public String getIdBook() {
        return idBook;
    }

    public void setIdBook(String idBook) {
        this.idBook = idBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAuthorBook() {
        return authorBook;
    }

    public void setAuthorBook(String authorBook) {
        this.authorBook = authorBook;
    }

    public int getPriceBook() {
        return priceBook;
    }

    public void setPriceBook(int priceBook) {
        this.priceBook = priceBook;
    }

    public String convertToStringBook() {
        return idBook + "," + nameBook + "," + authorBook + "," + priceBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "idBook='" + idBook + '\'' +
                ", nameBook='" + nameBook + '\'' +
                ", authorBook='" + authorBook + '\'' +
                ", priceBook=" + priceBook +
                '}';
    }
}
