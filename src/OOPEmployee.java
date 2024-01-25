public class OOPEmployee {
    int empNum;
    String empName;
    double empSalary;
    void setEmpDetails(int empNum,String empName, double empSalary){
        this.empNum=empNum;
        this.empName=empName;
        this.empSalary=empSalary;
    }
    void displayEmpDetails(){
        System.out.println("Employee number = "+empNum);
        System.out.println("Employee name = "+empName);
        System.out.println("Employee salary = "+empSalary);
    }

}
