package 小项目;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Bear a1 = new Bear("bill",1);
        LION a2 = new LION("lain",2,"公狮","棕色");
        mONKEY a3 = new mONKEY("tom",1,"金丝猴");
        Parrot a4 = new Parrot("rose",1,"牡丹鹦鹉");
        InterfaceAct a5 = new Joker("lahhe",5);
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("=============欢迎来到马戏团=============");
            System.out.println("=============请选择表演者=============");
            System.out.println("=============1,小熊=============");
            System.out.println("=============2,狮子=============");
            System.out.println("=============3,猴子=============");
            System.out.println("=============4,鹦鹉=============");
            System.out.println("=============5,小丑=============");
            System.out.println("==============0,退出============");
            int tar = sc.nextInt();
            switch (tar){
                case 1:
                    a1.act();
                    break;
                case 2:
                    a2.act();
                    break;
                case 3:
                    a3.act();
                    break;
                case 4:
                    a4.act();
                    break;
                case 5:
                    a5.act();
                    break;
                case 0:
                    return;
            }
            System.out.println("==============是否继续观看(1/0 yes/no)============");
            int ans = sc.nextInt();
            if (ans == 1){
                continue;
            } else if (ans == 0) {
                return;
            }
            else{
                System.out.println("输入有误  返回主菜单--");
            }

        }

    }
}
