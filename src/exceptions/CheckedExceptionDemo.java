package exceptions;

import java.io.IOException;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        try {
            int n = System.in.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
