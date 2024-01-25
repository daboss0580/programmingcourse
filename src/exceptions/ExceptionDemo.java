package exceptions;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Beginning of program");
        int n1=Integer.parseInt(args[0]);
        int n2=Integer.parseInt(args[1]);
        try {
            int res = n1 / n2;

            System.out.println(res);
        }
        catch (Exception e) {
            System.err.println("You cannot divide by zero");
        }
        System.out.println("End of program");

    }
}
