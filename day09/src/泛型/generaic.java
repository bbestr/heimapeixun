package 泛型;

public class generaic<T>{

    private T num;

    private int age;


    public generaic() {
    }

    public generaic(T num, int age) {
        this.num = num;
        this.age = age;
    }

    /**
     * 获取
     * @return num
     */
    public T getNum() {
        return num;
    }

    /**
     * 设置
     * @param num
     */
    public void setNum(T num) {
        this.num = num;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "generaic{num = " + num + ", age = " + age + "}";
    }
}
