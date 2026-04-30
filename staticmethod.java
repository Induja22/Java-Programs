class staticmethod {
    public static void main(String[] args) {
        method obj = new method();
        method.meth();
    }
}
class method{
    static void meth(){
        System.out.println("Hi");
    }
}