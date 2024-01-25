public class ConstructorDemo2 {
    int itemNumber;
    String itemName;
    ConstructorDemo2(int itemNumber, String itemName){
        this.itemNumber =itemNumber;
        this.itemName =itemName;
    }
    void display(){
        System.out.println("Number of item = "+ itemNumber);
        System.out.println("Name of item = "+ itemName);

    }
}
