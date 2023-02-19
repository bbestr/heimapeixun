package 包装类;

import com.sun.jdi.Value;

public class Demo1 {
    public static void main(String[] args) {
        int aa = 20;
        //手动装箱  两中方式
        Integer it = new Integer(aa);
        Integer it2 = Integer.valueOf(434);

        //手动拆箱  对象.xxValue()  方法
        int a1 = it.intValue();

        // 自动装箱
        Integer AE = aa;

        // 自动拆箱
        int aaa = AE;
        System.out.println(it);
        System.out.println(it2);




    }
}
