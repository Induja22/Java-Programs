class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        System.out.println(sb);
        char ch[] = {'h','e','l','l','o'};
        for(int i=0;i<ch.length;i++){
            sb.append(ch[i]);   
        }
        System.out.println(sb);
        sb.replace(0, 5, "Java Programming");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        int c = sb.capacity();
        System.out.println(c);
        sb.insert(0, "Welcome to ");
        System.out.println(sb);
        sb.delete(0, 11);
        System.out.println(sb);
        char ch1 = sb.charAt(2);
        System.out.println(ch1);
        sb.deleteCharAt(0);
        System.out.println(sb);
        StringBuilder sb1 = new StringBuilder("  HelloWorld  ");    
        System.out.println(sb1.capacity());
        sb1.trimToSize();
        System.out.println(sb1.capacity());

    }
}