import java.util.*;
class idsearch{
    public static void main(String[] args){
        int[] arr = {11,12,13,14,15,16,17,18,19,20};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ID to search:");
        int ID = sc.nextInt();
        int t=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ID){
                System.out.println("ID found at index: "+i);
                t++;
                return;
            }
        }
        if(t==0){
            System.out.println("ID not found");
        }
    }
}