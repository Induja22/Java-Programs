class copyconst{
    public static void main(String[] args) {
        constructor obj = new constructor("Hello");
        constructor obj2= new constructor(obj);
        System.out.println(obj.name);
        System.out.println(obj2.name2);
        
    }
}
class constructor{
    String name;
    String name2;
    constructor(String nm){
        name = nm;      
    }
    constructor(constructor j){
        name2 = j.name;
    }
}