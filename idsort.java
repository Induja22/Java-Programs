class idsort{
    public static void main(String[] args){
        int arr[] = {33,66,99,22,55,88,11,44,77,100};
        System.out.println("Library IDs :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted Library IDs :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}