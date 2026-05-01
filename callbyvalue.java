class callbyvalue{
    public static void main(String[] args){
        method obj = new method();
        int a = 10;
        obj.display(a);
    }
}
class method{
    static void display(int a){
        System.out.println(a);
    }
}