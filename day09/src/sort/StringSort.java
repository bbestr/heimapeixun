package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StringSort {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("z");
        list.add("v");
        list.add("c");
        list.add("r");
        list.add("b");

        System.out.println("排序前");
        Iterator tem = list.iterator();

        String i;

        while(tem.hasNext()){
            i = (String) tem.next();
            System.out.println(i);
        }

        System.out.println("默认升序排序后");
        Collections.sort(list);

        tem = list.iterator();
        while (tem.hasNext()){
            i = (String) tem.next();
            System.out.println(i);
        }

        System.out.println("降序排序后");

        Collections.sort(list,new StringComparator());
        tem = list.iterator();

        while (tem.hasNext()){
            i = (String) tem.next();
            System.out.println(i);
        }
    }
}
