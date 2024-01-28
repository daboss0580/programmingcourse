package ioprograms;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream=new FileInputStream("file3.txt");
        DataInputStream dataInputStream=new DataInputStream(fileInputStream);
        int n=dataInputStream.readInt();
        System.out.println(n);
        String s=dataInputStream.readUTF();
        System.out.println(s);
        double d=dataInputStream.readDouble();
        System.out.println(d);
    }
}
