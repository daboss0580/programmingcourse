import java.util.Scanner;

public class SumOfArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        int sum=0;
        System.out.println("Enter " + size + " values");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            sum+=numbers[i];

        }
        System.out.println(sum);
    }
}
