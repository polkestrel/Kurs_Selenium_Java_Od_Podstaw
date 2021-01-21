import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {

    public static void main(String[] args) {
        try {
            System.out.println("Before reading file");
            readFile("sds.txt");
            //readFile("C:\\SelfLearning\\Udemy\\Kurs Selenium od podstaw\\Selenium-course\\java-basics\\src\\test.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Wyjątek został wyrzucony");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Closing file");
        }
    }

    public static void readFile(String path) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);
    }
}
