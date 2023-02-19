package heima;

public class twoArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {3,4,5,6,7,8,9},
                {8,3,53,64,7},
                {1,321,5,25,52}
        };
        int total = 0;
        int sum;

        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum+=arr[i][j];
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
            System.out.println("第"+(i+1)+"季度总和:"+sum);
            total +=sum;

        }
        System.out.println("全年总和="+total);
    }
}
