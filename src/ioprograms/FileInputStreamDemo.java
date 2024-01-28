package ioprograms;


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
       FileInputStream fileInputStream=new FileInputStream("file2.txt");
        BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);
       int size=bufferedInputStream.available();
       byte [] buffer=new byte[size];
       bufferedInputStream.read(buffer);
       String s=new String(buffer);
        System.out.println(s);
        bufferedInputStream.close();
        fileInputStream.close();
    }
}
