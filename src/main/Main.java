package main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        PrintWriter outputStream;
        try {
            outputStream = new PrintWriter(new FileOutputStream("file.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
