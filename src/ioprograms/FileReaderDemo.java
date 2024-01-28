package ioprograms;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader fileReader =new FileReader("C:/Users/reach/Desktop/INTERVIEW MATERIALS/Hi Sai Saranya,.txt");
        int n;
        while ((n=fileReader.read()) !=-1)
            System.out.print((char)n);
        fileReader.close();
        System.out.println();
        char c ='p';
        System.out.println((int)c);
    }
}
