package 匿名内部类;

public class Petest {

    public void get(Persio persio){
        persio.read();
    }
    public static void main(String[] args) {
        //


        Petest pt = new Petest();

        pt.get(new Persio() {
            @Override
            public void read() {
                System.out.println("男的爱打游戏");
            }
        });
    }
}
