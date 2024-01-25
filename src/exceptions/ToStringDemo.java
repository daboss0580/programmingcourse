package exceptions;
class Product{
    int pId;
    String pName;
    double price;

    public Product(int pId, String pName, double price) {
        this.pId = pId;
        this.pName = pName;
        this.price = price;
    }
    public String toString(){
        return pId+" "+pName+" "+price;
    }

}

public class ToStringDemo {
    public static void main(String[] args) {
        Product product=new Product(102, "Perfume", 159.99);
        System.out.println(product);
    }
}
