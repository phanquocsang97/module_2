package introduce_to_java.exercise;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        double vnd = 230000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập vào số usd muốn đổi:");
        usd = sc.nextDouble();
        double vndQuyDoi = usd * vnd;
        System.out.println("Số tiền sau khi quy đổi là:" + vndQuyDoi + "VND");
    }
}
