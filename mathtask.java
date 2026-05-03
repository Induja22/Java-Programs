class mathtask{
    public static void main(String[] args){
        double d1 = 86.5;
        double d2 = 95.2;
        System.out.println("Maximum marks: "+Math.max(d1,d2));
        System.out.println("Minimum marks: "+Math.min(d1,d2));
        System.out.println("Round of mark: "+Math.round(d1));
        System.out.println("Power of mark: "+Math.pow(Math.round(d1),2));
        System.out.println("Square root of mark: "+Math.sqrt(Math.pow(Math.round(d1),2)));
        System.out.println("Absolute of mark: "+Math.abs(d1));
        System.out.println("Ceil: "+Math.ceil(d1));
        System.out.println("Floor: "+Math.floor(d2));
        System.out.println("Random number: "+Math.random()*100);
        System.out.println("Exponential: "+Math.exp(1));
        System.out.println("Log: "+Math.log(d1));
        double degree = 0;
        double radian = Math.toRadians(degree);
        System.out.println("Sin: "+Math.sin(radian));
        System.out.println("Cos: "+Math.cos(radian));
        System.out.println("Cube of mark: "+Math.pow(5,3));

    }
}