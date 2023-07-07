package algorithm_exam;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String str = "1,2,3";
        System.out.println(Arrays.toString(tinhChuoi(str)));
    }
    public static int[] tinhChuoi(String str){
        String[] strings = str.split(",");
        int[] ints = new int[strings.length];
        int[] newstring = new int[strings.length];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(strings[i]);
        }

        for (int i = 1; i < strings.length; i++) {
            newstring[0] = ints[0];
            newstring[i] = newstring[i - 1] + ints[i];
        }

        return newstring;
//        System.out.println(Arrays.toString(ints));
    }
}
