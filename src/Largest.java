import java.util.Scanner;
// largest of three numbers using scanner class
public class Largest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter first number and press Enter");
        int num1=scanner.nextInt();
        System.out.println("Please enter second number and press Enter");
        int num2=scanner.nextInt();
        System.out.println("Please enter third number and press Enter");
        int num3=scanner.nextInt();
        int largestNum=0;
        if (num1>num2 && num1>num3){
            System.out.println(num1 + " is the largest");
        }
        else if (num2>num1&&num2>num3){
            System.out.println(num2 + " is the largest");
        }
        else {
            System.out.println(num3 + " is the largest");
        }
    }
}