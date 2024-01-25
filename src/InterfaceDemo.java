interface Shape{
   void draw();
   default void sketch(){
       System.out.println("Sketching");
   }
}
class Circle implements Shape{
    public void draw(){
        System.out.println("Drawing a circle");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        Shape shape=new Circle();
        shape.draw();
        shape.sketch();
    }
}
