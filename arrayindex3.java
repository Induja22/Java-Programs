class arrayindex3{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        try {
            for(int i=1;i<=5;i++){
                System.out.print(arr[i]+" ");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}