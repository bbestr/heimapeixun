public class FruitsTest {
    public static void main(String[] args) {
        Fruits f1 = new Fruits("圆形","很甜");
        Fruits f2 = new Fruits("圆形","很甜");
        f1.eat();
        System.out.println("是否相同?"+f1.equals(f2));

        WaxBerry waxBerry = new WaxBerry("黑紫","圆的","酸酸甜甜");
        waxBerry.face();
        waxBerry.eat();

        System.out.println(waxBerry.toString());

        Banana banana = new Banana("月亮","香甜","芭蕉");
        banana.advance();
        banana.advance("黄色");


    }
}
