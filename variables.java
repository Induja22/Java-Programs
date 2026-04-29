class variables {
    public static void main(String[] args) {
        samp obj = new samp();
        obj.add();
        System.out.println(obj.a);
        System.out.println(samp.b);
        obj.a=200;
        System.out.println(obj.a);
        obj.b=300;
        System.out.println(samp.b);
    }
}
class samp{
    int a = 50;//instance variable 
    static int b = 100;//static variable
    void add(){//method
        int a=10;//local variable
        final int c=20;//final variable
        System.out.println(a);
        System.out.println(c);
    }
}