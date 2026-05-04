class arrayindex2{
    public static void main(String[] args) {
        String s[] = {};
        try {
            System.out.println(s[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}