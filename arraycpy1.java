class arraycpy1{
    public static void main(String[] args){
        int arr[] = {11,22,33,44,55,66,77,88,99,100};
        int arr1[] = new int[10];
        System.out.println("Original Array :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            arr1[i] = arr[i];
        }
        System.out.println("Copied Array :");
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}