public class stringbuilder {
    public static void main(String[] args) {
        String str = "abcdefg";

        StringBuilder sb = new StringBuilder();


        sb.append(str);

        System.out.println(sb);
        System.out.println(sb.hashCode());
//        int l = sb.length();
//
//        System.out.println(l);

        sb.append("jkl");
        System.out.println(sb.hashCode());




    }
}
