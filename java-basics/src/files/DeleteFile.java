package files;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("test.txt");

        if (file.delete()) {
            System.out.println("Usunęliśmy plik");
        } else {
            System.out.println("Nie udało się");
        }
    }
    }


