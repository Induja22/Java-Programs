class profile{
    public static void main(String[] args) {
        String name = "Arun";
        String city = "Chennai";
        String hobby = "Cricket";
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" from ");
        sb.append(city);
        sb.append(" loves ");
        sb.append(hobby);
        System.out.println(sb.toString().toUpperCase());
    }
}