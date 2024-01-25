class Outer{
    int m=15;
    class Inner{
        void perform(){
            System.out.println("m = "+m);
        }
    }
}
public class OuterInnerClassDemo {
    public static void main(String[] args) {
        Outer.Inner inner=new Outer().new Inner();
        inner.perform();
    }
}
