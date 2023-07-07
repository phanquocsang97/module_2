package algorithm_exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SoVong {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(check(100,1000));
    }
//    public static int checkSoVong(int a, int b){
//        List<Integer> list = new ArrayList<>();
//        int count = 0;
//        for (int i = 0; i < b; i++) {
//            if (i >= 10){
//                int numFirst = i;
//                while (numFirst >= 10){
//                    numFirst = numFirst / 10;
//                }
//                int numLast = i % 10;
//                if (numLast == numFirst){
//                    count++;
//                    list.add(i);
//                }
//            }else {
//                count++;
//            }
//
//        }
//        return count;
//    }
    public static boolean check(int num){
        String s = String.valueOf(num);
        if (s.charAt(0)==s.charAt(s.length()- 1)){
            return true;
        }
        return false;
    }
    public static String check(int a,int b){
        int count = 0;
        for (int i = a; i < b; i++) {
            if (check(i)){
                count++;
            }
        }
        return "Trong khoảng này có " + count + " số";
    }
}
