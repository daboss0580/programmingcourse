package exceptions;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            int n1= Integer.parseInt(args[0]);
            int n2= Integer.parseInt(args[1]);
            int res=n1/n2;
            System.out.println("Result = "+ res);
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic: Cannot divide by zero");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException: Requires two numbers");
        }
        catch (NumberFormatException e){
            System.out.println("NumberFormatException: Enter only numbers");
        }
        catch (RuntimeException e){
            System.out.println("RuntimeException occurred");
        }
        catch (Exception e){
            System.out.println("Exception occurred");
        }
    }
}
