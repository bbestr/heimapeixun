package 包装类;

public class Littletest {
    public static void main(String[] args) {


        String aaa = "dadadada";
        aaa = aaa.substring(0,2);
        char c = aaa.charAt(aaa.length());
        System.out.println(aaa);
        System.out.println(c);
        StringBuilder str = new StringBuilder("abcdefg");

        StringBuilder ret = new StringBuilder(str.substring(2, 5).toUpperCase());
        System.out.println(ret.toString());
        ret.replace(1,3,"MM");

        System.out.println(
                ret.toString()
        );

    }
}
