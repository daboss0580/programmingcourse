package java8;
@FunctionalInterface
interface Phone{
    void call();
}
/***class iOS implements Phone{
    @Override
    public void call(){
        System.out.println("Ringing");
    }
}*/
public class LambdaDemo {
    public static void main(String[] args) {
        //Phone phone=new iOS();
        //phone.call();
        //Anonymous inner classes
        Phone phone=new Phone() {
            @Override
            public void call() {
                System.out.println("Calling");
            }
        };
        phone.call();
        Phone phone1=()->{
                System.out.println("Calling 2");
            };
        phone1.call();
        //Remove curly braces from print statement
        Phone phone2=()-> System.out.println("Calling 3");
        phone2.call();
        //If the methods have an argument like in Phone11
        Phone11 phone11=(int number)-> System.out.println("Calling : " +number);phone11.call(555);

        Phone11 phone12=number-> System.out.println("Calling : " +number);phone12.call(333);
    }
}
interface Phone11{
    void call(int number);
        }