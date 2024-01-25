public class SumEvenAndOdd {
    public static void main(String[] args) {
        int i=1, sumEven = 0, sumOdd=0;
        while (i<=100){
            if (i%2==0)
                sumEven+=i;
            if (i%2==1)
                sumOdd+=i;
            i++;

        }
        System.out.println("The sum of even numbers "+sumEven);
        System.out.println("The sum of even numbers "+sumOdd);

    }
}
