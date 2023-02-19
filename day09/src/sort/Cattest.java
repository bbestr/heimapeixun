package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Cattest {
    public Cattest() {
    }

    public static void main(String[] args) {
        Cat huahua = new Cat("huahua", 5, "英国短毛猫");
        Cat fanfan = new Cat("fanfan", 2, "中华田园猫");
        Cat maomao = new Cat("maomao", 3, "中华田园猫");
        List<Cat> catList = new ArrayList();
        catList.add(huahua);
        catList.add(fanfan);
        catList.add(maomao);
        System.out.println("排序前：");
        Iterator var6 = catList.iterator();

        Cat cat;
        while(var6.hasNext()) {
            cat = (Cat)var6.next();
            System.out.println(cat);
        }

        Collections.sort(catList,new NameCompator());
        System.out.println("按名称排序");
        var6 = catList.iterator();

        while(var6.hasNext()){
            cat = (Cat) var6.next();
            System.out.println(cat);
        }


        Collections.sort(catList, new AgeCompator());
        System.out.println("按年龄降序排序后：");
        var6 = catList.iterator();

        while(var6.hasNext()) {
            cat = (Cat)var6.next();
            System.out.println(cat);
        }

    }
}
