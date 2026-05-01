//Todo list program in java
import java.util.Scanner;
class todolist{
    public static void main(String[] args){
        todo obj = new todo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your task1:");
        String s = sc.nextLine();
        System.out.println("Enter your task2:");
        String t = sc.nextLine();
        System.out.println("Enter your task3:");
        String u = sc.nextLine();
        System.out.println("Your to-do list:");
        obj.list(s);
        obj.list(t);
        obj.list(u);
        System.out.println("Thank you for entering the task");

    }
}
class todo{
    void list(String s){
        if(s.isBlank()){
            System.out.println("Task not entered");
            return;
        }else{
            System.out.println(s);
        }
        
    }
}