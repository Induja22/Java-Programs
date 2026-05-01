// Write a program that takes a string as input and checks its length
// If length is less than 5 print Short
// If length is 5 or more print Long

class stringlength{
    public static void main(String[] args){
        String S = "Java";
        int length = S.length();
        System.out.println("String length : "+length);
        if(length < 5)
            System.out.println("Short");
        else
            System.out.println("Long");
    }
}