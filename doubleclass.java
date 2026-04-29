class doubleclass {
    public static void main(String[] args) {
        samp obj = new samp();
        samp obj1 = new samp();
        obj.a=100;
        System.out.println(obj.a);
        System.out.println(obj.b);
       
        System.out.println(obj1.a);
        System.out.println(obj1.b);
        System.out.println(obj.c);
    }
}
class samp{
    int a = 50;//instance variable 
    static int b = 100;//static variable'
    final int c = 200;//final variable
}