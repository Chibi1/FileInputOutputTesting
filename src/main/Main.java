package main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        String fileName = "file2.txt";
        PrintWriter outputStream = null;
        String name = "Harry Rhodes";
        String denomination = "atheist";
        int age = 21;
        try {
            outputStream = new PrintWriter(new FileOutputStream(fileName));
            outputStream.write("{"
                    + "\n\t\"Name\": \"" + name + "\""
                    + "\n\t\"Denomination\": \"" + denomination + "\""
                    + "\n\t\"Age\": \"" + age + "\""
                    + "\n}");
            System.out.println("File written without error");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

        outputStream.close();
    }
}
