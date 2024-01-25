import java.util.Scanner;

public class MultiplicationTable {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number");
        int res=scanner.nextInt();
        for (int i=1; i<=12; i++){
            int ans=res*i;
            System.out.println(res+ " * "+i+ " = "+ ans);
        }
        scanner.close();


    }
}
