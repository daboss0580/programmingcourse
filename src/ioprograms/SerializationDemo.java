package ioprograms;

import java.io.*;

class Book implements Serializable{
    int bookNo;
    String bookName;
    transient double price;

    public Book(int bookNo, String bookName, double price) {
        this.bookNo = bookNo;
        this.bookName = bookName;
        this.price = price;
    }
    public String toString(){
        return bookNo+" : "+bookName+" : "+price;
    }
}
public class SerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Serialization
        FileOutputStream fileOutputStream=new FileOutputStream("book.txt");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        Book book=new Book(101,"Things fall apart",21.4);
        objectOutputStream.writeObject(book);
        objectOutputStream.close();
        fileOutputStream.close();
        //Deserialization
        FileInputStream fileInputStream=new FileInputStream("book.txt");
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        Book book1= (Book) objectInputStream.readObject();
        System.out.println(book1);
        objectOutputStream.close();
        fileInputStream.close();
    }
}
