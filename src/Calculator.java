import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int result=0;
        System.out.println("Please enter two numbers");
        int n1=scanner.nextInt();
        int n2=scanner.nextInt();
        System.out.println("1.Add");
        System.out.println("2.Subtract");
        System.out.println("3.Multiply");
        System.out.println("4.Divide");
        System.out.println("Enter your choice");
        int choice=scanner.nextInt();
        switch (choice){
            case 1: result =n1+n2;break;
            case 2: result =n1-n2;break;
            case 3: result =n1*n2;break;
            case 4: result =n1/n2;break;
            default:
                System.out.println("Invalid choice");
        }
        System.out.println("Result is "+result) ;
    }
}
