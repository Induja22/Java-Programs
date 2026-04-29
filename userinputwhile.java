import java.util.*;
class userinputwhile{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        while(n!=0){
            System.out.println("The number is: " + n);
            n = s.nextInt();
        }
    }
}