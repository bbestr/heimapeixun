package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class GoodsTest {
    public GoodsTest() {
    }

    public static void main(String[] args) {
        Goods g1 = new Goods("s00001", "手机", 2000.0);
        Goods g2 = new Goods("s00002", "冰箱", 5000.0);
        Goods g3 = new Goods("s00003", "电视机", 3000.0);
        List<Goods> goodsList = new ArrayList();
        goodsList.add(g1);
        goodsList.add(g2);
        goodsList.add(g3);
        System.out.println("排序前：");
        Iterator tem = goodsList.iterator();

        Goods goods;
        while(tem.hasNext()){
            goods = (Goods) tem.next();
            System.out.println(goods);
        }
        Collections.sort(goodsList);
        System.out.println("排序后");
        tem = goodsList.iterator();
        Goods goods1;

        while(tem.hasNext()){
            goods1 = (Goods) tem.next();
            System.out.println(goods1);
        }

    }
}
