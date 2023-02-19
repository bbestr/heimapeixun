import java.util.Scanner;

public class 回文字符串 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ret = sc.next();
        StringBuilder sb = new StringBuilder(ret);

        if (sb.toString().equals(sb.reverse().toString())){
            System.out.println("是回文串");

        }else{
            System.out.println("不是回文串");
        }
    }
}
