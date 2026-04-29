class operators {
    public static void main(String arr[]) {
        int a=15;
        int b=5;
        boolean c=true;
        boolean d=false;
        //Arithmetic Operators
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        //Relational Operators
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(!c);
        //Logical Operators
        System.out.println(c && d);
        System.out.println(c || d);
        //Bitwise Operators
        System.out.println(a & b );
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(~a);
        System.out.println(a>>b);
        System.out.println(a<<b);
        //Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println(max);
        int g = 10;
        System.out.println(g);
        //Increment Operator
        System.out.println(g++);
        System.out.println(++g);
        //Decrement Operators
        System.out.println(g--);
        System.out.println(--g);

        int f = 10;
        System.out.println(f++ + ++f + --f);

    }
}