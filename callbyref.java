class callbyref{
    public static void main(String[] args){
       method obj = new method();
       obj.display(obj);
    }
}
class method{
    int a = 10;
    static void display(method m){
        System.out.println(m.a);
    }  
}