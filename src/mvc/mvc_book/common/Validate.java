package mvc.mvc_book.common;

import java.util.Scanner;

public class Validate {
    static Scanner scanner = new Scanner(System.in);

    public static String validateNameBook() {
        final String REGEX_NAME_BOOK = "^([A-Z][a-z]+\\s)+[A-Z][a-z]*$";
        boolean check = true;
        String name = null;
        do {
            try {
                System.out.println("Nhập tên sách với chữ cái đầu viết hoa : ");
                name = scanner.nextLine();
                check = name.matches(REGEX_NAME_BOOK);
            } catch (Exception e) {
                System.out.println("Vui lòng nhập lại");
            }
        } while (!check);
        return name;
    }

    public static String validateAuthorBook() {
        final String REGEX_AUTHOR_BOOK = "^([A-Z][a-z]+\\s)+[A-Z][a-z]*$";
        boolean check = true;
        String author = null;
        do {
            try {
                System.out.println("Nhập tên tác giả với chữ cái đầu viết hoa : ");
                author = scanner.nextLine();
                check = author.matches(REGEX_AUTHOR_BOOK);
            } catch (Exception e) {
                System.out.println("Vui lòng nhập lại");
            }
        } while (!check);
        return author;
    }
}
