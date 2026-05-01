import java.util.Scanner;
class todolist{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your task:");
        String s = sc.nextLine();
        todo obj = new todo();
        obj.list(s);
    }
}
class todo{
    void list(String s){
        if(s.isBlank()){
            System.out.println("Task not entered");
            return;
        }else{
            System.out.println("Entered task : "+s);
        }
        System.out.println("Thank you for entering the task");
    }
}