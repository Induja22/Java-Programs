import java.util.*;
class userinput{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        do{
            n=s.nextInt();
            System.out.println("The number is: " + n);
        } while(n != 0);
    }
}