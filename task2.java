//Positive or Negative
import java.util.Scanner;
class task2{    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Number is: "+n);
        if(n>0) {
            System.out.println("Positive");
        } else if(n<0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}