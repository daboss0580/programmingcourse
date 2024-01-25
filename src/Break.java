import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, sum = 0;
        while (true) {
            System.out.println("Enter a number or enter 0 (ZERO) to stop");
            number = scanner.nextInt();
            if (number == 0)
                break;
            sum += number;
            System.out.println("Current total is " + sum);
        }
        System.out.println("Total is " + sum);
    }
}
