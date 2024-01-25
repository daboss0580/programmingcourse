import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " values");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = scanner.nextInt();
        System.out.println("Given array elements");
        for (int number : numbers) System.out.println(number);
    }
}
