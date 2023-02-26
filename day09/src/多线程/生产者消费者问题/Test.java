package 多线程.生产者消费者问题;

public class Test {
    public static void main(String[] args) {

        Queue queue = new Queue();

        Customer c1 = new Customer(queue);
        Producer c2 = new Producer(queue);
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);

        t1.start();
        t2.start();


    }
}
