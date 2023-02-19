package 继承;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[][] a = new int[4][];
        int sum = 0;
        for (int z = 0; z < a.length; z++) {
            a[z] = new int[]{1,2,3,4};
            sum += Arrays.stream(a[z]).sum();
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }


        System.out.println("综合"+sum);

        int[] abc = new int[]{1,2,4};

        System.out.println(a);
        test ee = new test();
        System.out.println(ee.toString());
    }

}
