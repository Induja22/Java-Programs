import java.util.Scanner;
class task4{    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("First number is: "+a);
        System.out.println("Second number is: "+b);
        if(a > b) {
            System.out.println("Larger number is: " + a);
        } else if(a == b) {
            System.out.println("Equal");
        } else {
            System.out.println("Larger number is: " + b);
        }
    }
}
