class array{
    public static void main(String[] args){
        int arr[] = new int[5];    // create an array of size 5
        //add elements to array
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        //traverse array
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        arr[3] = 100;   
        arr[2] = 200;
        arr[4] = 300;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}