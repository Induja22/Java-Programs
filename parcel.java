import java.util.Arrays;
class parcel {
    public static void main(String[] args) {
        int arr[] = {100,101,102,103,104,105,106};
        System.out.println("Numbers : "+Arrays.toString(arr));
        arr[2] = 200;
        System.out.println("Updated Numbers : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}