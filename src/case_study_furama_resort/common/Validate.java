package case_study_furama_resort.common;

import java.util.Scanner;

public class Validate {
    static Scanner scanner = new Scanner(System.in);

    public static String validateIdEmployee() {
        final String REGEX_ID = "^NV-[0-9]{4}$";
        boolean check = true;
        String id = null;
        do {
            try {
                System.out.println("Nhập mã nhân viên theo định dạng 'NV-XXXX': ");
                id = scanner.nextLine();
                check = id.matches(REGEX_ID);
            } catch (Exception e) {
                System.out.println("Vui lòng nhập lại");
            }
        } while (!check);
        return id;
    }

    public static String validateIdCustomer() {
        final String REGEX_ID = "^KH-[0-9]{4}$";
        boolean check = true;
        String id = null;
        do {
            try {
                System.out.println("Nhập mã khách hàng theo định dạng 'KH-XXXX' : ");
                id = scanner.nextLine();
                check = id.matches(REGEX_ID);
            } catch (Exception e) {
                System.out.println("Vui lòng nhập lại");
            }
        } while (!check);
        return id;
    }

    public static String validateName() {
        final String REGEX_NAME = "^([A-Z][a-z]+\\s)+[A-Z][a-z]*$";
        boolean check = true;
        String name = null;
        do {
            try {
                System.out.println("Nhập tên với chữ cái đầu viết hoa : ");
                name = scanner.nextLine();
                check = name.matches(REGEX_NAME);
            } catch (Exception e) {
                System.out.println("Vui lòng nhập lại");
            }
        } while (!check);
        return name;
    }

    public static String validateIdentityNumber() {
        final String REGEX_IDENTITY = "^\\d{9,12}$";
        boolean check = true;
        String identity = null;
        do {
            try {
                System.out.println("Nhập CMND (9->12 số)");
                identity = scanner.nextLine();
                check = identity.matches(REGEX_IDENTITY);
            } catch (Exception e) {
                System.out.println("Vui lòng nhập lại");
            }
        } while (!check);
        return identity;
    }

    public static String validatePhoneNumber() {
        final String REGEX_NUMBERPHONE = "^0[0-9]{9}$";
        boolean check = true;
        String numberPhone = null;
        do {
            try {
                System.out.println("Nhập SĐT (bắt đầu là số 0, gồm 10 số) : ");
                numberPhone = scanner.nextLine();
                check = numberPhone.matches(REGEX_NUMBERPHONE);
            } catch (Exception e) {
                System.out.println("Vui lòng nhập lại");
            }
        } while (!check);
        return numberPhone;
    }

    public static String validateSalary() {
        boolean flag = true;
        String salary = null;
        do {
            try {
                System.out.println("Nhập lương ( > 0)");
                salary = scanner.nextLine();
                if (Integer.parseInt(salary) > 0) {
                    return salary;
                } else {
                    flag = false;
                }
            } catch (Exception e) {
                System.out.println("Vui lòng nhập lại");
                flag = false;
            }
        } while (true);
    }
}
