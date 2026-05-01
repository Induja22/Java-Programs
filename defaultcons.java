class defaultcons{
    public static void main(String[] args){
        constructor obj = new constructor();
        System.out.println(obj.name);
    }
}
class constructor{
    String name;
    constructor(){
        name = "Hello";
    }
}
