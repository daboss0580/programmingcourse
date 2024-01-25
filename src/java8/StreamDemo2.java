package java8;

import java.util.ArrayList;
import java.util.List;

class Product{
    int productID;
    String productName;
    double price;
    Product(int productID, String productName, double price){
        this.productID=productID;
        this.productName=productName;
        this.price=price;
    }
    public String toString(){
        return productID+" "+productName+" "+price;
    }
}
public class StreamDemo2 {
    public static void main(String[] args) {
        List<Product>newList=new ArrayList<>();
        for (Product product:getProducts()) {
            if (product.price>100)
                System.out.println(product);
        }
    }
    private static List<Product>getProducts(){
        List<Product>productList=new ArrayList<>();
        productList.add(new Product(111,"Monitor",200));
        productList.add(new Product(112,"Keyboard",20));
        productList.add(new Product(113,"CPU",250));
        productList.add(new Product(114,"UPS",100));
        productList.add(new Product(115,"Speaker",70));
        productList.add(new Product(116,"Mouse",19));
        return productList;
    }
}
