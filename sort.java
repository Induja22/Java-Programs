class sort{
    public static void main(String[] args){
        int arr[] = {3,2,1};
        for(int i=0;i<3;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
        for(int i=0;i<3;i++){
            for(int j=i;j<3;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0;i<3;i++){
            System.out.print(arr[i]+" ");
        }
    }
}