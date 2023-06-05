package introduce_to_java.practice;

import java.util.Date;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Your weight(in kilogram): ");
        weight = scanner.nextDouble();
        System.out.println("Your height (in meter):");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");
        if (bmi < 18){
            System.out.println(bmi + " underweight");
        } else if (bmi < 25.0) {
            System.out.println(bmi + " normal");
        } else if (bmi < 30.0) {
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        }else {
            System.out.println(bmi + " obese");
        }
    }
}
