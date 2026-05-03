import java.util.Scanner;
class math{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = 10; 
        int b = 16;
        int c = 4;
        int d = 27;
        double f = 2.5;
        double g = 3.2;
        double e = 3.14;       
        //Absolute
        System.out.println("Absolute: " + Math.abs(a));   //Math.abs(value) 
        //min
        System.out.println("Min: " + Math.min(a, c)); //Math.min(value1, value2)
        //max
        System.out.println("Max: " + Math.max(a, b)); //Math.max(value1, value2)
        //power
        System.out.println("Power: " + Math.pow(a, c)); //Math.pow(base, exponent)
        //Square root
        System.out.println("Square root: "+Math.sqrt(b));  //Math.sqrt(value)
        //cube root
        System.out.println("Cube root: "+Math.cbrt(d));  //Math.cbrt(value)
        //round()
        System.out.println("Round of: "+Math.round(e)); //Math.round(value)
        //floor()
        System.out.println("Floor: "+Math.floor(f)); //Math.floor(value)
        System.out.println("Floor: "+Math.floor(g));
        //ceil()
        System.out.println("Ceil: "+Math.ceil(f)); //Math.ceil(value)
        System.out.println("Ceil: "+Math.ceil(g)); 

        System.out.println("Enter the degree : ");
        double degree = sc.nextDouble();
        double radian = Math.toRadians(degree); //Math.toRadians(degree) java not support degree so we change the degree to radian
        //sin()
        System.out.println("Sin : "+Math.sin(radian));
        //cos()
        System.out.println("Cos : "+Math.cos(radian));
        //tan()
        System.out.println("Tan : "+Math.tan(radian));
    }
}