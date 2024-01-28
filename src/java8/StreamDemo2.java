package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
                newList.add(product);
        }
        newList.forEach(System.out::println);
        System.out.println("------------------------------");
        //Using stream API to improve performance of the software
        List<Product>newList1=getProducts().stream().filter((product) -> product.price>100).collect(Collectors.toList());
        newList1.forEach(System.out::println);
        System.out.println("------------------------------");
        List<Product>newList2=getProducts().stream().filter((product) -> product.price>100).toList();
        newList2.forEach(System.out::println);
        System.out.println("------------------------------");
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
