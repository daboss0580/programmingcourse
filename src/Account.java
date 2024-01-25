public class Account {
    int accountNo;
    String accountType;
    int accountBalance;
    void setAccountDetails(int accountNo, String accountType, int accountBalance) {
        this.accountNo = accountNo;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }
    void withdraw(int withdrawalAmount){
        accountBalance=accountBalance-withdrawalAmount;
    }
    void deposit(int depositAmount){
        accountBalance=accountBalance+depositAmount;
    }
    void displayAccountDetails(){
        System.out.println("Account number is "+accountNo+", Account type is "+accountType+", Account balance is "+accountBalance);
    }
}
class Main1{
    public static void main(String[] args) {
        Account account=new Account();
        account.setAccountDetails(1012039444,"Checking",4000);
        account.displayAccountDetails();
        account.withdraw(1500);
        account.displayAccountDetails();
        account.deposit(10000);
        account.displayAccountDetails();
    }
}
