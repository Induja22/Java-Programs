class nullpointerexception{
    public static void main(String[] args) {
        String s = null;
        try {
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("Invalid");
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}