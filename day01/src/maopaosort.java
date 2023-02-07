public class maopaosort {
    public static void main(String[] args) {
        int[] arr ={1,5,2,6,3,8,9,61,4,7};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] >= arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(" "+arr[i]);
        }
    }
}
