class Base{
    int i;
    int j;
    Base(int i, int j){
        this.i=i;
        this.j=j;
    }

    void display(){
        System.out.println("i = "+i+ ",  j = "+j);
    }
}
class Derived extends Base{
    int k;
    Derived(int i, int j,int k){
        super(i, j);
        this.k=k;
    }
@Override
void display(){
    super.display();
    System.out.println("k = "+k);
}
}
public class Inheritance1 {
    public static void main(String[] args) {
        Base base=new Base(10,20);
        base.display();
        Derived derived=new Derived(30, 20,40);
        derived.display();

    }
}
