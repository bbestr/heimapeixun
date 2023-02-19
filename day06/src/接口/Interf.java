package 接口;

public interface Interf extends Interf1{
    String tmd = "3232";

    default void add(){
        System.out.println("hahah");
    }


}
