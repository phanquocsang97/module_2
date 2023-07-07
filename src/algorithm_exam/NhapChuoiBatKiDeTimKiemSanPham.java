package algorithm_exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NhapChuoiBatKiDeTimKiemSanPham {
    public static void main(String[] args) {
        String[] str = {"iphone 14", "iphone 13 pro max", "samsung filip", "samsung sida", "iphone sida"};
        System.out.println(Arrays.toString(check(str)));
    }

    public static String[] check(String[] str) {
        System.out.println("Nhập tên muốn tìm kiếm");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(name);
        List<String> stringList = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].contains(name)) {
                count++;
                stringList.add(str[i]);
            }
        }
        int index = 0;
        String[] newStr = new String[count];
        for (int i = 0; i < newStr.length; i++) {
            newStr[i] = stringList.get(i);
        }
        return newStr;
    }
}
