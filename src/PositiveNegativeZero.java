import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number");
        int num =scanner.nextInt();
        if (num>0){
            System.out.println("Number is Positive");
        }
        else if (num==0){
            System.out.println("Number is Zero");
        }
        else {
            System.out.println("Number is Negative");
        }
    }
}
