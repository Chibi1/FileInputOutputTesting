package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fileName = "file.txt";
        PrintWriter outputStream = null;
        String name = "Harry Rhodes";
        String denomination = "atheist";
        int age = 21;
        try {
            outputStream = new PrintWriter(new FileOutputStream(fileName));
            outputStream.write(name + ":" + denomination + ":" + age);
            System.out.println("File written without error");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        outputStream.close();

        String fileName2 = "file2.txt";
        Scanner inputStream = null;
        String name2 = "";
        String denomination2 = "";
        int age2 = 0;
        try {
            inputStream = new Scanner(new File(fileName2));
            inputStream.useDelimiter(":");
        } catch (FileNotFoundException e) {
            System.out.println(e);
            System.exit(0);
        }
        while (inputStream.hasNextLine()) {
            name2 = inputStream.next();
            denomination2 = inputStream.next();
            age2 = inputStream.nextInt();
        }
        System.out.println(name2 + denomination2 + age2);
    }
}
