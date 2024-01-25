import java.util.Scanner;

public class SmallestOfTen {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter 10 numbers");
        int numbers, i=1, smallest=0;
        while (i<=10){
            numbers=scanner.nextInt();
            if (numbers<i)
                smallest=numbers;
            i++;

        }
        System.out.println(smallest);
    }
}