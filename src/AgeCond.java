import java.util.Scanner;

public class AgeCond {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your age : ");
        int age = scanner.nextInt();
        if (age>=18){
            System.out.println("You are a Major and can go in");
        } else if (age<=0) {
            System.out.println("Invalid age");
        }
        else {
            System.out.println("You are a Minor and can't go in");
        }
    }
}
