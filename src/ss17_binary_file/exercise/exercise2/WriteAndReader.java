package ss17_binary_file.exercise.exercise2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndReader {
    public static void writeFileBinary(String pathFile, List<String> stringList) {
        File file = new File(pathFile);
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(stringList);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found !!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> readFileBinary(java.lang.String pathFile) {
        List<String> stringList = new ArrayList<>();
        File file = new File(pathFile);
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            stringList = (List<String>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return stringList;
    }
}
