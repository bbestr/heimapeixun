package 内部类;

public class Person {
    public static void main(String[] args) {
        PersonTest PT = new PersonTest();
        PT.age = 12;

        // 成员内部类访问方式  1. 先new 外部类 在new 内部类
        // 2. 外部对象.new 内部类
        // 3. 外部类.获取方法
        // 内部类中可以通过外部类.this.属性名 来访问外部同名属性
        // 内部类.class 文件名为: 外部类名$内部类名.class
        // 外部类无法直接访问内部类成员,需先创建内部类实例来访问
        /*
        PersonTest.Heart ph = new PersonTest().new Heart();
        PersonTest.Heart ph1 = PT.new Heart();

        ph.beat();
        ph1.beat();
        PT.getHeart().beat();
        */

        //静态内部类获取方法  不需要依赖外部类对象
        PersonTest.Heart ph = new PersonTest.Heart();

        ph.beat();
        PT.getHeart();

    }
}
