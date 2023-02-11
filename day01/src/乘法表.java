import java.util.Arrays;

public class 乘法表 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < i+1; j++) {
                System.out.format("%d*%d=%d",j,i,i*j);
                System.out.print(' ');
            }
            System.out.print('\n');
        }
    }
}
