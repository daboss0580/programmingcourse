import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter radius");
        double radius = scanner.nextInt();
        double pi =3.14;
        double area=pi*radius*radius;
        System.out.println(area);
    }
}
