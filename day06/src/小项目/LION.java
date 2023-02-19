package 小项目;

public class LION extends Animal implements InterfaceAct{
    private String sex;
    private String color;


    public LION(String name, int age, String sex, String color) {
        super(name, age);
        this.sex = sex;
        this.color = color;
    }

    @Override
    public void love() {
        System.out.println("喜欢吃鸡肉");
    }

    @Override
    public void skill() {
        System.out.println("擅长钻火圈");
    }

    @Override
    public void act() {
        System.out.println("表演者:"+this.name);
        System.out.println("性别:"+this.sex);
        System.out.println("年龄:"+this.age);
        System.out.println("毛色:"+this.color);
        System.out.print("技能:");
        this.skill();
        System.out.print("爱好:");
        this.love();

    }
}
