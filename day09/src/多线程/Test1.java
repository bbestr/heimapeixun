package 多线程;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String iu = sc.nextLine();

        Bank1 bank1 = new Bank1("bk0001",1000);
        SaveBalence saveBalence = new SaveBalence(bank1);
        DrawBalence drawBalence = new DrawBalence(bank1);
        Thread t1 = new Thread(saveBalence);
        Thread t2 = new Thread(drawBalence);



        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("账户余额为:"+bank1.getBalence());
    }
}
