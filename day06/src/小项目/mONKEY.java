package 小项目;

public class mONKEY extends Animal implements InterfaceAct{

    private String type;

    public mONKEY() {
    }

    public mONKEY(String name, int age,String type) {
        super(name, age);
        this.type = type;
    }

    @Override
    public void love() {
        System.out.println("喜欢模仿人的动作");
    }

    @Override
    public void skill() {
        System.out.println("骑独轮车过独木桥");
    }

    @Override
    public void act() {
        System.out.println("表演者"+this.name);
        System.out.println("年龄"+this.age);
        System.out.println("品种"+this.type);
        System.out.print("技能:");
        this.skill();
        System.out.print("爱好:");
        this.love();
    }
}
