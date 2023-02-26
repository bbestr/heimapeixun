package 多线程.生产者消费者问题;

public class Queue {
    private int n;

    private boolean flag = false;


    public Queue() {
    }

    public Queue(int n, boolean flag) {
        this.n = n;
        this.flag = flag;
    }

    /**
     * 获取
     * @return n
     */
    public int getN() {
        return n;
    }

    /**
     * 设置
     * @param n
     */
    public void setN(int n) {
        this.n = n;
    }

    /**
     * 获取
     * @return flag
     */
    public boolean isFlag() {
        return flag;
    }

    /**
     * 设置
     * @param flag
     */
    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String toString() {
        return "Queue{n = " + n + ", flag = " + flag + "}";
    }

    public synchronized int get(){
        if(flag == false){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("消费:"+n);
        flag = false;
        notifyAll();
        return n;
    }

    public synchronized void set(int n){
        if(flag == true){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("生产:"+n);

        this.n = n;
        flag = true;
        notifyAll();
    }
}
