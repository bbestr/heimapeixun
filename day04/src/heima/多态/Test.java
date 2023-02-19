package heima.多态;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args) {

//        Roo a = new Roo();
//        a.leap();
//
////强制类型转换 是大类型到小类型  这里是  Animal  -> Roo
//        Animal a1 = new Roo();
//        ((Roo)a1).leap();
// 错误写法  下面是

//        Animal pe = new Animal();
//        Roo ro = new (Roo)pet();
//
//        Roo op = new Animal();
//        op.leap();

        Animal[] animals = new Animal[5];

        Random rm = new Random();

        for (int i = 0; i < animals.length; i++) {
            int j = rm.nextInt(3);

            switch (j){
                case 0:
                    animals[i] = new Cat();
                    break;

                case 1:
                    animals[i] = new Dog();
                    break;

                case 2:
                    animals[i] = new Sheep();
                    break;
            }
        }


        for (int i = 0; i < animals.length; i++) {

            System.out.println(animals[i]);
            if (animals[i] instanceof Cat){
                animals[i].cry("猫猫");
            } else if (animals[i] instanceof Dog) {
                animals[i].cry("狗狗");
            }else{
                animals[i].cry("羊羊");
            }
        }


    }
}
