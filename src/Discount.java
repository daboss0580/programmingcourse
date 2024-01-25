import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter item number");
        int itemNumber = scanner.nextInt();
        System.out.println("Please enter item name");
        String itemName = scanner.next();
        System.out.println("Please enter item rate");
        double itemRate = scanner.nextDouble();
        System.out.println("Please enter item quantity");
        int itemQuantity = scanner.nextInt();
        double actualPrice = itemRate * itemQuantity;
        if (actualPrice < 1000) {

            System.out.println("No discount for this item");
            System.out.println("Please pay £" + actualPrice);
        } else if (actualPrice >= 1000 && actualPrice < 2000) {
            double discount = actualPrice * ((double) 10 / 100);
            System.out.println("You've got discount of £" + discount);
            double newPrice = actualPrice - discount;
            System.out.println("Please pay £" + newPrice);
        } else if (actualPrice >= 2000 && actualPrice < 3000) {
            double discount = actualPrice * ((double) 15 / 100);
            System.out.println("You've got discount of £" + discount);
            double newPrice = actualPrice - discount;
            System.out.println("Please pay £" + newPrice);
        } else if (actualPrice >= 3000 && actualPrice < 5000) {
            double discount = actualPrice * ((double) 20 / 100);
            System.out.println("You've got discount of £" + discount);
            double newPrice = actualPrice - discount;
            System.out.println("Please pay £" + newPrice);
        } else if (actualPrice >= 5000) {
            double discount = actualPrice * ((double) 25 / 100);
            System.out.println("You've got discount of £" + discount);
            double newPrice = actualPrice - discount;
            System.out.println("Please pay £" + newPrice);
        }
    }
}
