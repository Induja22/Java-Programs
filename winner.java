import java.util.Random;
class winner{
    public static void main(String[] args) {
        Random r = new Random();
        String[] s = {"Arun", "Bala", "Cathy", "Divya", "Eshan"};
        int n = r.nextInt(5);
        System.out.println("Winner is: "+s[n]);
    }
}