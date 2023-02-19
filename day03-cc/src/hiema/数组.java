package hiema;

public class 数组 {
    public static void main(String[] args) {
        int[] ary = new int[]{111,23,222,33,44,96,190,78,212};

        int min =ary[0];
        int max =ary[0];
        int sum = 0;
        double avg = 0;
        int count = 0;

        for (int i = 0; i < ary.length; i++) {
            sum += ary[i];
            if (ary[i] > max){
                max = ary[i];
            }
            if (ary[i] < min){
                min = ary[i];
            }
        }


        avg = sum / ary.length;

        for (int i = 0; i < ary.length; i++) {
            if (ary[i] < avg){
                count++;
            }

        }
        System.out.println("最大值:"+max);
        System.out.println("最小值:"+min);
        System.out.println("总和:"+sum);
        System.out.println("平均值:"+avg);
        System.out.println("低于平均值人数:"+count);
        int flag = -1;
        for (int i = 0; i < ary.length; i++) {
            flag = -1;
            for (int j = 0; j < ary.length-i-1; j++) {
                    if (ary[j] > ary[j+1]){
                        int temp = ary[j];
                        ary[j] = ary[j+1];
                        ary[j+1] = temp;
                        flag = 1;
                    }
            }
            if (flag == -1){
                break;
            }
        }
//        System.out.println("冒泡排序升序:");
//        for (int i = 0; i < ary.length; i++) {
//            System.out.print(" "+ary[i]);
//        }

//        System.out.println("选择排序");
//
//        for (int i = 0; i < ary.length; i++) {
//            int minindex = i;
//
//            for (int j = i; j < ary.length; j++) {
//                if (ary[j] < ary[minindex]){
//                    minindex = j;
//                }
//            }
//
//            int tem = ary[minindex];
//            ary[minindex] = ary[i];
//            ary[i] = tem;
//        }
//        for (int i = 0; i < ary.length; i++) {
//           System.out.print(" "+ary[i]);
//        }
        System.out.println("插入排序");

//        int current;
//        for (int i = 0; i < array.length - 1; i++) {
//            current = array[i + 1];
//            int preIndex = i;
//            while (preIndex >= 0 && current < array[preIndex]) {
//                array[preIndex + 1] = array[preIndex];
//                preIndex--;
//            }
//            array[preIndex + 1] = current;
//        }


        for (int i = 1; i < ary.length; i++) {
            int tmp = ary[i];
            int curren = i;
            while(i > 0 && ary[curren] < ary[curren-1]){
                ary[curren+1] = ary[curren];
                curren--;
            }
            ary[curren] = tmp;


        }
        for (int i = 0; i < ary.length; i++) {
           System.out.print(" "+ary[i]);
        }



    }
}
