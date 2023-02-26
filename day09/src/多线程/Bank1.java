package 多线程;

public class Bank1 {
    private String id;

    private int balence;

    public Bank1() {
    }

    public Bank1(String id, int balence) {
        this.id = id;
        this.balence = balence;
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**d
     * 获取
     * @return balence
     */
    public int getBalence() {
        return balence;
    }

    /**
     * 设置
     * @param balence
     */
    public void setBalence(int balence) {
        this.balence = balence;
    }

    public String toString() {
        return "Bank1{id = " + id + ", balence = " + balence + "}";
    }

    public synchronized void saveBalence(){
        int balence = getBalence();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        balence += 100;

        setBalence(balence);

        System.out.println("存款后的余额="+balence);
    }

    public void drawBalence() {
        synchronized (this) {
            int balence = getBalence();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            balence -= 200;

            setBalence(balence);
            System.out.println("取款后余额为=" + balence);
        }
    }
}
