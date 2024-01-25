import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double balance, amount;
        int choice;
        System.out.println("Enter current balance");
        balance=scanner.nextInt();
        do {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display balance");
            System.out.println("4. Exit");
            System.out.println("Please enter a choice");
            choice=scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter deposit amount");
                    amount=scanner.nextDouble();
                    balance=balance+amount;
                    break;
                case 2:
                    System.out.println("Enter withdrawal amount");
                    amount=scanner.nextDouble();
                    if (amount>balance){
                        System.out.println("Insufficient balance");
                    }else
                    {
                        balance=balance-amount;
                        break;
                    }
                case 3:
                    System.out.println("Current balance is "+balance);
                    break;
                case 4:
                    System.out.println("Thank you for banking with us");
                    break;
                default:
                    System.out.println("Invalid choice");


            }
        }
        while (choice!=4);
    }
}
