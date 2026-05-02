import java.util.ArrayList;
class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);    //arr.add(value)
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        System.out.println(arr);
        arr.set(3,100);   //arr.set(index,value)
        arr.set(4,20);
        System.out.println(arr);
        arr.remove(4);     //arr.remove(index)
        System.out.println(arr);
    }
}