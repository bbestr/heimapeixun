package 多线程;

public class DrawBalence implements Runnable {
    Bank1 bank1;

    public DrawBalence(Bank1 bank1){
        this.bank1 = bank1;
    }
    @Override
    public void run() {
        bank1.drawBalence();
    }
}
