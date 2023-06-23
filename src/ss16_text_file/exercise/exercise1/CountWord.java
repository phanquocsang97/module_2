package ss16_text_file.exercise.exercise1;

import java.util.List;

public class CountWord {
    public static void main(String[] args) {
        List<String> list = CopyFile.copyFile("D:\\CodeGym\\Module 2\\src\\ss16_text_file\\exercise\\exercise1\\source.csv");
        System.out.println(list);
        CopyFile.writeFile("D:\\CodeGym\\Module 2\\src\\ss16_text_file\\exercise\\exercise1\\target.csv", list, false);
    }
}
