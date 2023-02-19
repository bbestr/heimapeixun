package 包装类;

public class Stringtest {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = "abc";
        String s24 = "abc";
        String s3 = s2 + "c";
        System.out.println(s3 == s24);
    }
}
