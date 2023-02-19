package 匿名内部类;

public abstract class Persio {
    int age;

    public Persio(int age) {
        this.age = age;
    }

    public Persio() {
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public abstract void read();
}
