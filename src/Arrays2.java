import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter array size");
        int size=scanner.nextInt();
        int [] numbers=new int[size];
        System.out.println("Enter "+size+" values");
        for (int i=0; i<numbers.length;i++)
            numbers[i]=scanner.nextInt();
        System.out.println("Enter search value");
        int searchValur=scanner.nextInt();
        boolean isFound=false;
        for (int number:numbers){
            if (searchValur==number){
                isFound=true;
                break;
            }
        }
        if (isFound)
            System.out.println("Found");
        else System.out.println("Not found");
    }
}
