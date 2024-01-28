package ioprograms;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream=new FileOutputStream("file2.txt");
        BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fileOutputStream);
        String s= "Java is my programming language :)";
        bufferedOutputStream.write(s.getBytes());
        System.out.println("File created");
        bufferedOutputStream.close();
        fileOutputStream.close();
    }
}
