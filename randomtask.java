import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
class randomtask{
    public static void main(String[] args){
        Random rand = new Random();
        int num = rand.nextInt(1000);  
        System.out.println("Student ID: "+num);
        double d = rand.nextDouble()*100;
        System.out.println("Marks: "+d);
        float f = rand.nextFloat()*100;
        System.out.println("Attendance: "+f);
        boolean b = rand.nextBoolean();
        System.out.println("Status: "+b);
        long l = rand.nextLong();
        System.out.println("Registration number: "+l);
        double d1 = rand.nextGaussian()*10;
        System.out.println("Performance Score: "+d1);
        byte bt[]  = new byte[5];
        rand.nextBytes(bt);
        System.out.println(Arrays.toString(bt));
        IntStream stream = rand.ints(5, 0, 100);
        int[] arr = stream.toArray();
        System.out.println("5 Random Numbers : "+Arrays.toString(arr));

    }
}