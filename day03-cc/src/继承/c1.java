package 继承;

public class c1 extends f1{
    public void pritr(){
        super.pritr();
        System.out.println("我是cccc");
    }

    public static void main(String[] args) {
//        f1 fg = new f1();
//        fg.pritr();
        c1 d = new c1();
        d.pritr();
    }
}
