package practice;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class BallTest {
    public void getBall(Ball ball){
        ball.play();
    }
    public void info(){
        class Inner_f implements Ball{

            @Override
            public void play() {
                System.out.println("方法内部类 打兵乓求");
            }
        }

        new Inner_f().play();
    }
    class Inner_m implements Ball{

        @Override
        public void play() {
            System.out.println("成员内部类 打篮球");
        }
    }
    public static void main(String[] args) {
        BallTest ballTest = new BallTest();
//        BallTest.Inner_m BI = new BallTest().new Inner_m();
        BallTest.Inner_m BI = ballTest.new Inner_m();
        // 匿名内部类调用
        ballTest.getBall(new Ball() {
            @Override
            public void play() {
                System.out.println("匿名内部类 打羽毛球");
            }
        });

        // 成语内部类
        System.out.println("=======================");
        BI.play();

        System.out.println("=======================");
        // 方法内部类
        ballTest.info();
    }
}
