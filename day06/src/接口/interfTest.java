package 接口;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class interfTest implements Interf,Interf1{
    public static void main(String[] args) {
        Interf1 i2 = new interfTest();
        Interf i1 = new interfTest();
        

        System.out.println(i2.tmd);
        System.out.println(i1.tmd);
    }
}
