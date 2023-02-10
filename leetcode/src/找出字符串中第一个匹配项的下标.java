import java.util.Scanner;

public class 找出字符串中第一个匹配项的下标 {

    /*
    * 给你两个字符串 haystack 和 needle ，
    * 请你在 haystack 字符串中找出 needle
    * 字符串的第一个匹配项的下标（下标从 0 开始）。
    * 如果 needle 不是 haystack 的一部分，则返回  -1 。
    *
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int ret = solution(a,b);
        System.out.println(ret);

    }
    public static int solution(String a,String b){

        int ret = 0;

        int la = a.length();
        int lb = b.length();
        if(lb > la){
            return -1;
        }
        else{
            for (int i = 0; i < la-lb+1; i++) {
                String tmp = a.substring(i,i+lb);
                System.out.println(tmp);
                if(tmp.equals(b)){
                    System.out.println(a.substring(i,i+lb));

                    ret = i;
                    return ret;
                }
            }

        return -1;
        }
    }
}
