import java.util.*;
public class javaBank {
    public static String bankName = "JavaBank";
    public String customer_name;
    public double customer_balance;

    // constructor
    javaBank(String customer_name){
        this.customer_name = customer_name;
    }

    public void deposit(double amount){
        this.customer_balance = this.customer_balance+amount;
        System.out.println("Your Balance is : "+this.customer_balance);
    }

    public void withdraw(double amount){
        if(amount > customer_balance){
            System.out.println("Balance not Available");
            System.exit(0);
        }
        else{
            this.customer_balance = this.customer_balance - amount;
            System.out.println("Your Balance is : "+this.customer_balance);
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to JavaBank !");
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Name : ");
        String customer_name = scn.next();
        javaBank customer_1 = new javaBank(customer_name);
        System.out.println("\nHello "+customer_1.customer_name+" Your Account Got Created");
        
        while(true){
            System.out.println("\n\nD-Deposit\nW-Withdraw\nE-Exit");
            System.out.print("Enter Your Choice : ");
            String option = scn.next();
            
            if(option.equalsIgnoreCase("D")){
                System.out.print("\nEnter Amount : ");
                double amount = scn.nextDouble();
                customer_1.deposit(amount);
            }

            else if(option.equalsIgnoreCase("W")){
                System.out.print("\nEnter Amount to Withdraw : ");
                double amount = scn.nextDouble();
                customer_1.withdraw(amount);
            }

            else if(option.equalsIgnoreCase("E")){
                System.out.println("\nThanks for using JavaBank");
                System.exit(0);
            }

            else{
                System.err.println("\nPlease choose valid option");
            }
        }
    }
}
