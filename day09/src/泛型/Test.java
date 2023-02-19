package 泛型;

public class Test {
    public static void main(String[] args) {
        generaic<Integer> gg = new generaic<>();

        gg.setNum(12);
        System.out.println(gg.getNum());

        generaic<String> gg1 = new generaic<>();
        gg1.setNum("dadawd");
        System.out.println(gg1.getNum());
    }
}
