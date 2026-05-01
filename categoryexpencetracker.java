// Task: Category-Based Expense Tracker
// A user spends money on different categories like Food, Travel, Shopping.
// Your program should:1. Ask the user to enter expense amount and category 2. Store them
// 3. Calculate total expense 4. Calculate total spent on Food only
// 5. Display all expenses with categories
import java.util.*;
class categoryexpencetracker{
    public static void main(String[] args) {
        expence obj = new expence();
        obj.exp();
    }
}
class expence{
    void exp(){
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int foodtotal = 0;
        while(true){
            System.out.println("Enter category : ");
            String s = sc.nextLine();
            System.out.println("Enter price : ");
            int price = sc.nextInt();
            sc.nextLine();
            total += price;
            if(s.equalsIgnoreCase("Food")){
                foodtotal += price;
            }
            System.out.println("Do you want to continue?");
            int choice = sc.nextInt();
            sc.nextLine();
            if(choice == 0){
                break;
            }
            
        }
       System.out.println("Total price : "+total);
       System.out.println("Food total: " + foodtotal);
    }
}