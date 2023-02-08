public class 字符串常见面试题 {
    public static void main(String[] args) {
        StringBuilder ss = new StringBuilder("hahah");
//
//
//        String s1 = "abc";
//        String s2 = "a" + "b" + "c";
//
//        System.out.println(s1 == s2);


//        String s1 = "abc";
//        String s2 = "ab";
//        String s3 = s2 + "c";
//
//        System.out.println(s1 == s3);
        String s1 = "abc";
        String s2 = new String("abc");

        System.out.println(s1 == s2);
    }
}
