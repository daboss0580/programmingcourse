import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter Roll Number : ");
        int rollNum=scanner.nextInt();
        System.out.println("Please enter Student firstName : ");
        String studName=scanner.next();
        System.out.println("Please enter score in English : ");
        double score1=scanner.nextDouble();
        System.out.println("Please enter score in Mathematics : ");
        double score2=scanner.nextDouble();
        System.out.println("Please enter score in Physics : ");
        double score3=scanner.nextDouble();
        double sum=score1+score3+score3;
        double  average=sum/3;
        System.out.println("Roll Number = "+rollNum);
        System.out.println("Full name = "+studName);
        System.out.println("Total score = "+sum);
        System.out.println("Average score = "+average);
        if (average<40){
            System.out.println(studName+" failed with grade E");
        }
        else if (average<50){
            System.out.println(studName+" failed with grade D");
        }
        else if (average<60){
            System.out.println(studName+" Passed with grade C");
        }
        else if (average<70){
            System.out.println(studName+" Passed with grade B");
        }
        else {
            System.out.println(studName+" Passed with grade A");
        }
    }

}
