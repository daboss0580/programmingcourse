import java.util.Scanner;

public class Sum1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int number, i=1, sum=0;
        while (i<=10){
            System.out.println("Please enter a number");
            number=scanner.nextInt();
            sum+=number;
            i++;
            System.out.println("Sum so far is " +sum);
        }
        System.out.println("Total is "+sum);
    }
}
