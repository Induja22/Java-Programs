import java.util.*;
class searcharray{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to search:");
        int key = sc.nextInt();
        int t=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("Element found at index: "+i);
                t++;
                return;
            }
        }
        if(t==0){
            System.out.println("Element not found in the array");
        }
    }
}