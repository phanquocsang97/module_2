package ss16_text_file.exercise.exercise2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = ReadFileCountry.readFile("D:\\CodeGym\\Module 2\\src\\ss16_text_file\\exercise\\exercise2\\countries.csv");
        String[] info = null;
        for (String s : list) {
            info = s.split(",");
            System.out.println(Arrays.toString(info));
        }
    }
}
