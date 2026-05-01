class parametercons{
    public static void main(String[] args) {
        constructor obj = new constructor("Hello");
        constructor obj2= new constructor("World");
        System.out.println(obj.name);
        System.out.println(obj2.name);
        
    }
}
class constructor{
    String name;
    constructor(String nm){
        name = nm;      
    }
}