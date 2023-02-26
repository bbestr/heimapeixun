package 多线程;

public class SaveBalence implements Runnable{
    Bank1 bank1;

    public SaveBalence(Bank1 bank1){
        this.bank1 = bank1;
    }
    @Override
    public void run() {
        bank1.saveBalence();
    }
}
