// Task First Character Finder
// Requirement
// Write a program that takes a string as input and prints the first character of the string
import java.util.*;
class firstchar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s = sc.nextLine();
        char c = s.charAt(0);
        System.out.println(c);
    }
}