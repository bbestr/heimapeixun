import java.util.Scanner;

public class 统计字符 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ss = sc.nextLine();

        char[] chars = ss.toCharArray();
        int count1=0;
        int count2=0;
        int count3=0;
        int count4=0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z'){
                count1++;
            }else if(chars[i] >= 'A' && chars[i] <= 'Z'){
                count2++;
            } else if (chars[i] >= '0' && chars[i] <= '9') {
                count3++;
            }else{
                count4++;
            }


        }
        System.out.println("小写字符:"+count1);
        System.out.println("大写字符:"+count2);
        System.out.println("数字字符:"+count3);
        System.out.println("其他字符:"+count4);

    }
}
