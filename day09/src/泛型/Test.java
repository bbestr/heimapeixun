package 泛型;

public class Test {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = "ABC";
        String s4 = "a";
        String s5 = s4 + "bc";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s2.equals(s5));
        System.out.println(s3.equalsIgnoreCase(s5));
        System.out.println(34+23+"dad");
        generaic<Integer> gg = new generaic<>();

        gg.setNum(12);
        System.out.println(gg.getNum());

        generaic<String> gg1 = new generaic<>();
        gg1.setNum("dadawd");
        System.out.println(gg1.getNum());
    }
}
