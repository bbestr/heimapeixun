package 内部类;

public class PersonTest {
    int age;

    //方法内部类
    // 不能包含 静态资源, 不能使用访问修饰福
    // 可以包含 final 和 abstract 修饰的

    public void getHeart(){
        class heihei{
                public void beat(){
                    System.out.println("hahahahahaha");
                }


        }
        new heihei().beat();
    }

    // 成员内部类
//    class Heart{
//        public void beat(){
//            System.out.println("心脏会跳动");
//        }
//    }

    // 只能访问外部静态资源, 访问非静态需要创建外部对象来调用
    static class Heart{
        public void beat(){
            System.out.println("心脏会跳动");
        }
    }
}
