package ioprograms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter=new FileWriter("file4.txt");
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        String s = "Test running FileWriter";
        bufferedWriter.write(s);
        System.out.println("File created");
        bufferedWriter.close();
        fileWriter.close();
    }
}
