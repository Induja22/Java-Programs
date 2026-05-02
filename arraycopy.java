import java.util.Arrays;
class arraycopy{
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int arr1[] = new int[5];
        System.arraycopy(arr, 0, arr1, 0, 5);   //(source, sourcePosition, destination, destinationPosition, length);
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        int arr2[] = {1,20,3,40,5};
        int arr3[] = new int[5];
        arr3 = Arrays.copyOf(arr2, 5);   //(source array, length);
        for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i] + " ");
        }
        System.out.println();

        int arr4[] = {1,5,8,3,9};
        int arr5[] = new int[arr4.length];    //int arr5[] = arr4.clone(); 
        arr5 = arr4.clone();
        for(int i=0;i<arr5.length;i++){
            System.out.print(arr5[i] + " ");   //System.out.println(Arrays.toString(arr5));
        }
        System.out.println();
    }
}