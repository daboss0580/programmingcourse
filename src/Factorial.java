import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scanner.nextInt();
        int f = fact(number);
        System.out.println(f);

    }

    static int fact(int number) {
        int f = 1;
        for (int i = number; i >= 1; i--)
            f = f * i;

        return f;

    }
}
