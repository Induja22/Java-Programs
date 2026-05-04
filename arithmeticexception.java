class arithmeticexception{
    public static void main(String[] args) {
        int a=10;
        try {
           int b = a/0; 
           System.out.println(b);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}