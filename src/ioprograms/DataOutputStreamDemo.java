package ioprograms;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream=new FileOutputStream("file3.txt");
        DataOutputStream dataOutputStream=new DataOutputStream(fileOutputStream);
        dataOutputStream.writeInt(200);
        dataOutputStream.writeUTF("Hello");
        dataOutputStream.writeDouble(3.14);
        System.out.println("File created");
        dataOutputStream.close();
        fileOutputStream.close();

    }
}
