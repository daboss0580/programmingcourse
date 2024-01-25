package exceptions;
class AgeException extends Exception{
    AgeException(String msg){
        super(msg);
    }
}
class Customer{
    void setAge(int age)throws AgeException{
        if (age<18||age>60)
            throw new AgeException("Age should be between 18 and 60");
        else System.out.println("Your age : "+age);
    }
}
public class CustomExceptionDemo {
    public static void main(String[] args) {
        Customer customer=new Customer();
        try {
            customer.setAge(10);
        } catch (AgeException e) {
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
