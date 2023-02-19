package 小项目;

public abstract class Animal {
    String name;
    int age;
    public Animal(){

    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void love();
}
