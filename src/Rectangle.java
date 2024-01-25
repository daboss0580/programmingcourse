import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter length");

        int length = scanner.nextInt();
        System.out.println("Please enter width");
        int width = scanner.nextInt();
        int area = length * width;
        System.out.println("The Area of Rectangle is "+area);

    }
}
