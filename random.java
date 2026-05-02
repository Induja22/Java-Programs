import java.util.Arrays;
import java.util.Random;
class random{
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(10);  
        System.out.println(num);
        boolean b = rand.nextBoolean();
        System.out.println(b);
        double d = rand.nextDouble();
        System.out.println(d);
        long l = rand.nextLong();
        System.out.println(l);
        float f = rand.nextFloat();
        System.out.println(f);
        double d1 = rand.nextGaussian();
        System.out.println(d1);
        double d2 = 10 + (2 * rand.nextGaussian());  //Mean = 10, Standard Deviation = 2 
        System.out.println(d2);
        byte bt[]  = new byte[10];
        System.out.println(Arrays.toString(bt));
        rand.nextBytes(bt);
        System.out.println(Arrays.toString(bt));
    }
}