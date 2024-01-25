abstract class Vehicle1{
    abstract void drive();
    void ApplyBrakes(){
        System.out.println("Breaking");
    }
}
class Car1 extends Vehicle1{
    void changeGear(){
        System.out.println("Changing gear");
    }
    void drive(){
        System.out.println("Car drives");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Vehicle1 vehicle1 =new Car1();
        vehicle1.ApplyBrakes();
        vehicle1.drive();
        Car1 car1=new Car1();
        car1.changeGear();
    }
}
