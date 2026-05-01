//Expence tracker take input from user and take the input until the user enters 0 once the user enters 0 stop taking input and display the total price
import java.util.*;
class expencetracker{
    public static void main(String[] args){
        expence obj = new expence();
        obj.exp();
    }
}
class expence{
    void exp(){
        Scanner sc = new Scanner(System.in);
        int total = 0;
        while(true){
            System.out.println("Enter expence : ");
            String s = sc.nextLine();
            System.out.println("Enter price : ");
            int price = sc.nextInt();
            sc.nextLine();
            total += price;
            System.out.println("Do you want to continue?");
            int choice = sc.nextInt();
            sc.nextLine();
            if(choice == 0){
                break;
            }
            
        }
       System.out.println("Total price : "+total);
    }
}








/*
Another way to do the same thing using recursion
//Expence tracker take input from user and take the input until the user enters 0 once the user enters 0 stop taking input and display the total price
import java.util.*;
class expencetracker{
    public static void main(String[] args){
        expence obj = new expence();
        int ans = obj.exp();
        System.out.println("Total price: " + ans);
    }
}
class expence{
int total = 0;
    int exp(){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter expence : ");
            String s = sc.nextLine();
            System.out.println("Enter price : ");
            int price = sc.nextInt();
            sc.nextLine();
            total += price;
            System.out.println("Do you want to continue?");
            int choice = sc.nextInt();
            sc.nextLine();
            if(choice == 0){
                return total;
            }else{
                return exp();}
            
        }
    }
}
*/