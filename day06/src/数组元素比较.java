public class 数组元素比较 {
    public static void main(String[] args) {
        数组元素比较 a = new 数组元素比较();
        int[] nums1 = {1,2,3,4,5,6,7,8,9};
        int[] nums2 = {1,2,3,4,5,6,7,8,9};

        boolean ret = a.compare(nums1,nums2);
        System.out.println("两数组比较结果是:"+ret);
    }


    public static boolean compare(int[] nums1,int[] nums2){

        if(nums1.length != nums2.length){
            return false;
        }
        else{

            for (int i = 0; i < nums1.length; i++) {
                if(nums1[i] != nums2[i]){
                    return false;
                }
            }
            return true;
        }

    }
}
