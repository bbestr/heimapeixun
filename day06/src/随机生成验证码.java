import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Random;

public class 随机生成验证码 {
    public static void main(String[] args) {
          /*
        请从26个英文字母（大小写都包含），以及数字0-9中，随机产生一个5位的字符串验证码并打印在控制台
        效果：uYq8I，3r4Zj

        思路: 准备一个字符数组 char[] chs, 内部装满 a~z A~Z 0~9
                随机从数组中取出5个字符, 并拼接为一个字符串

        细节: 打印数组名字会看到内存地址, 但是字符类型数组, 是直接看到内容
                - 原因: println内部源码, 自动遍历.
     */
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String ma = " ";
        char[] cr = new char[62];

        generate(cr);
        Random rm = new Random();
        for (int i = 0; i < 5; i++) {
            char j = str.charAt(rm.nextInt(62));
            ma += j;
        }
        System.out.println("生成的验证码:"+ma);
    }

    private static void generate(char[] cr){

        int index = 0;

        for (char i = 'a'; i <= 'z'; i++) {
            cr[index] = i;
            index++;
        }
        for (char i = 'A'; i <= 'Z'; i++) {
            cr[index] = i;
            index++;
        }
        for (char i = '0'; i <= '9'; i++) {
            cr[index] = i;
            index++;
        }


    }
}

