import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number, i=1,largest=0;
        System.out.println("Please enter TEN numbers, press ENTER key after each number");
        while (i<=4){

            number=scanner.nextInt();
            if (number>largest)largest=number;
            i++;

        }
        System.out.println("The largest number is "+ largest);
    }
}
