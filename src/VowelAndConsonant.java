import java.util.Scanner;

public class VowelAndConsonant {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter just ONE letter");
        char choice=scanner.next().charAt(0);
        if (Character.isLetter(choice)){
            switch (Character.toLowerCase(choice)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(choice +" is a vowel");
                    break;
                default:
                    System.out.println(choice +" is a consonant");
            }
        }
        else {
            System.out.println("Please enter a valid letter");
        }
        scanner.close();
    }
}
