public class SumFact {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("-------------------------------------------");
        System.out.println("    Number                   Factorial");
        System.out.println("-------------------------------------------");
        for (int i = 1; i <= 5; i++) {
            System.out.println("      " + i + "                         " + factorial(i));
            sum = sum + factorial(i);
        }
        System.out.println("-------------------------------------------");
        System.out.println("     Sum            =           " + sum);
        System.out.println("-------------------------------------------");
    }
        static int factorial(int num){
            int f=1;
            for (int j=num;j>=1;j--)
                f=f*j;
        return f;
    }
}
