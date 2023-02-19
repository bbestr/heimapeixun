package 集合;

import javax.swing.*;
import java.security.KeyStore;
import java.util.*;

public class LikedListdemo {
    public static void main(String[] args) {

        Set sssss = new HashSet(10);
        System.out.println(sssss);
        LinkedList<Object> l1 = new LinkedList<Object>();
        LinkedList<Book> l2 = new LinkedList<Book>();

        Set<Integer> ss = new HashSet<Integer>();

        ss.add(1);
        ss.add(2);
        ss.add(3);

        Map<String,Integer> mm = new HashMap<String,Integer>();
        mm.put("1",11);
        mm.put("2",22);
        mm.put("3",33);
//  1  第一种遍历map 方式  通过entryset  同时直接获取 key value
//        Set<Map.Entry<String,Integer>> sss = mm.entrySet();
//        Iterator<Map.Entry<String,Integer>> it = sss.iterator();
//
//        System.out.println(it.hasNext());
//        while(it.hasNext()){
//            Map.Entry<String,Integer> tmp = it.next();
//            System.out.println(tmp.getKey()+"::"+tmp.getValue());
//
//        }

        // 2 第二种遍历  先获取key值
//        System.out.println("==================================");
//        Set<String> ssss = mm.keySet();
//        Iterator<String> it = ssss.iterator();
//
//        while(it.hasNext()){
//
//            String tmp = it.next();
//
//            System.out.print(tmp+"::");
//            System.out.println(mm.get(tmp));
//        }
        // 3 第三种 只适用于只想获取value值得时候

        Collection<Integer> cc = mm.values();

        Iterator<Integer> it = cc.iterator();

        while(it.hasNext()){

            Integer tmp = it.next();
            System.out.println(tmp);
        }


        System.out.println("==================================");
        System.out.println(ss);
        System.out.println(mm);
        System.out.println("====================================");
        Book b1 = new Book(1,"刀剑神域",56.2);
        Book b2 = new Book(1,"未来日记",29.9);
        Book b3 = new Book(1,"花园宝宝",45);

        l2.push(b1);
        l2.push(b2);
        l2.push(b3);

        l1.add(new String("3mljda"));
        l1.add(Integer.valueOf(23));
        l1.add("rtyu");
        l1.add("ghgjg");
        l1.add("2");

        boolean flag = l1.contains("add");

        if (flag){
            System.out.println("存在add");
        }else{
            System.out.println("不存在add");
        }


        System.out.println(l1.peek());
        System.out.println(l1.toArray().length);
        System.out.println(l1);
        System.out.println(l1.pop());
        System.out.println(l1.toArray().length);
        System.out.println(l1);

        System.out.println(l1.getFirst());
        System.out.println(l1.getLast());
        System.out.println(l1.get(2));

        System.out.println(l2);
        System.out.println(l2.peek());
        System.out.println(l2.pop());
        System.out.println(l2);
        System.out.println(l2.poll());
        System.out.println(l2);
    }
}
