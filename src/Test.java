public class Test {
    public static void main(String[] args) {
        OOPEmployee employee = new OOPEmployee();
        employee.setEmpDetails(112, "Kingsley", 7364.55);
        employee.displayEmpDetails();

        ConstructorDemo1 constructorDemo1 = new ConstructorDemo1(10, 20);
        constructorDemo1.display();
        ConstructorDemo2 constructorDemo2 = new ConstructorDemo2(102, "Cement");
        constructorDemo2.display();
    }
}
