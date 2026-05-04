class arrayindex1{
    public static void main(String[] args) {
        int marks[] = {85,90,78};
        try {
            marks[5]= 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}