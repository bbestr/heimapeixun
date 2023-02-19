package 接口;

public interface Interface {
    default void show(){
        System.out.println("我是默认方法");
    }
}
