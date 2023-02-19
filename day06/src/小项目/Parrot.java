package 小项目;

public class Parrot extends  Animal implements InterfaceAct{
    private String type;

    public Parrot(String type) {
        this.type = type;
    }

    public Parrot(String name, int age, String type) {
        super(name, age);
        this.type = type;
    }

    @Override
    public void love() {
        System.out.println("喜欢吃坚果和松子");
    }

    @Override
    public void skill() {
        System.out.println("擅长模仿人");
    }

    @Override
    public void act() {
        System.out.println("表演者:"+this.name);
        System.out.println("年龄:"+this.age);
        System.out.println("品种:"+this.type);
        System.out.print("技能:");
        this.skill();
        System.out.print("爱好:");
        this.love();

    }
}
