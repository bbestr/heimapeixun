package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IntSort {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();

        list1.add(55);
        list1.add(22);
        list1.add(66);
        list1.add(44);

        System.out.println("排序前");
        Iterator tem = list1.iterator();

        Integer i ;
        while(tem.hasNext()){
            i = (Integer)tem.next();
            System.out.println(i);
        }
        Collections.sort(list1);

        tem = list1.iterator();
        System.out.println("排序后");
        while(tem.hasNext()){
            i = (Integer)tem.next();
            System.out.println(i);
        }


        System.out.println("降序排序后");
        Collections.sort(list1,new IntComparator());

        tem = list1.iterator();

        while(tem.hasNext()){
            i = (Integer) tem.next();
            System.out.println(i);
        }

    }



}
