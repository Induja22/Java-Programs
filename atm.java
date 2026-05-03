//using Abstraction: Hide unnecessary details/Encapsulation: Binding data
import java.util.Scanner;
class atm{
        public static void main(String args[])
        {
            int pin_no = 2006;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the pin : ");
            int pin = sc.nextInt();
            sample o = new sample();
            if(pin == pin_no)
            {
                System.out.println("1. Check Balance\n2. Deposit\n3. Withdraw\n4. Exit");
                int choice;
                
                do{
                System.out.println("Enter your choice (1/2/3/4): ");
                choice = sc.nextInt();
                if(choice == 1)
                {
                    System.out.println("Balance: " + o.getBalance());
                    continue;
                }
                else if(choice == 2)
                {
                    System.out.println("Enter the amount to deposit: ");
                    double amount = sc.nextDouble();
                    o.deposit(amount);
                    System.out.println("Available Balance: " + o.getBalance());
                    System.out.println("Amount deposited successfully");
                }
                else if(choice == 3)
                {
                    System.out.println("Enter the amount to withdraw: ");
                    double amount = sc.nextDouble();
                    o.withdraw(amount);
                    System.out.println("Available Balance: " + o.getBalance());
                    System.out.println("Amount withdrawn successfully");
                }
                else if(choice == 4)
                {
                    System.out.println("Thank you");
                    return;
                }
                else
                {
                    System.out.println("Invalid choice");
                }
                
            }while(choice != 4);
        }
            
            else
            {
                System.out.println("Pin is incorrect");
            }
        }
}
class sample{
    private double balance = 0;
    double getBalance()
    {
        return balance;
    }
    void deposit(double amount)
    {
        balance += amount;
    }
    void withdraw(double amount){
        if (amount > balance) {
            System.out.println("Insufficient balance");
            return;
        }
        balance -= amount;
    }
}
