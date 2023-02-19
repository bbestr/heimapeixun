package 包装类;

public class Demo2面试 {
    public static void main(String[] args) {
        //装箱后用 == 比较  对象地址时
        // 包装类的 缓存区  数据在缓存区 short byte integer long[-128-127]之内 则相同  不在则重新生成对象
        //  character [0,127]
        //  Boolean true,false  缓存区
        // (除 Double Float  外  )
        Integer i1 = Integer.valueOf(20);
        Integer i2 = Integer.valueOf(20);
        System.out.println(i1 == i2);
        Integer i3 = Integer.valueOf(200);
        Integer i4 = Integer.valueOf(200);
        System.out.println(i3 == i4);
        // double
        Double i5 = Double.valueOf(20);
        Double i6 = Double.valueOf(20);
        System.out.println(i5 == i6);

        //当调用 equals 比较时类型相同 并且值相同则true,  当比较对方为基本数据类型时,会先装箱后进行比较.
        int b = 20;
        Integer b2 = Integer.valueOf(20);
        System.out.println(b2.equals(b));

        char v = 'c';

        Character character = Character.valueOf('3');
        System.out.println(character.equals(v));

        System.out.println("=======================");
        String a1 = "dada";
        String a2 = new String("dada");


        System.out.println(a1.compareTo(a2));

        String ste = new String("hello woeld");
        byte[] da = ste.getBytes();
//        byte[] da1 = ste.getBytes("UTF-8");
//        byte[] da2 = ste.getBytes("GBK");
//        System.out.println(da1.toString());


        String ss = null;
        System.out.println(ss);




    }
}
