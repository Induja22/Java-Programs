import java.util.*;
class getuserinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Enter your height: ");
        float height = sc.nextFloat();
        System.out.println("Your email id: ");
        String email = sc.next();
        System.out.println("Enter your phone number: ");
        long phone = sc.nextLong();
        System.out.println("Enter your salary:");
        double salary = sc.nextDouble();
        System.out.println("Your name is : "+name);
        System.out.println("Your age is : "+age);
        System.out.println("Your height is : "+height);     
        System.out.println("Your email id is : "+email);
        System.out.println("Your phone number is : "+phone);
        System.out.println("Your salary is : "+salary);
    
    }
}