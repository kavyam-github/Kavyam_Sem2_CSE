import java.util.Scanner;
class Bank_Account{
    long accountNo;
        String username;
        String email;
        String accountType;
        double accountBalance;
    Bank_Account(){
        addAccountDetails();
        displayDetail();
    }
    
    public void addAccountDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details:");
        System.out.print("AccountNo: ");
        accountNo=sc.nextLong();
        System.out.print("Username:");
        username=sc.next();
        System.out.print("Email: ");
        email=sc.next();
        System.out.print("AccountType: ");
        accountType=sc.next();
        System.out.print("AccountBalance: ");
        accountBalance=sc.nextDouble();
        }
    
    public void displayDetail(){
        System.out.println("Entered details");
        System.out.println("AccountNo: "+accountNo);
        System.out.println("Username: "+username);
        System.out.println("Email: "+email);
        System.out.println("AccountType: "+accountType);
       System.out.println("AccountBalance: "+accountBalance);
       // System.out.print("AccountNo: "+accountNo);
    
        
    }
    
    
}


public class Lab5_4 {
    
    public static void main(String[] args) {
      //  System.out.println("Hello, World!");
        Bank_Account  A1 = new Bank_Account();
     
}

}