package 小项目;

public class Bear extends Animal implements InterfaceAct{
    public Bear() {
    }

    public Bear(String name, int age) {
        super(name, age);
    }

    @Override
    public void love() {
        System.out.println("小熊爱卖萌");
    }

    @Override
    public void skill() {
        System.out.println("挽着花篮,跳舞,喜欢走秀");
    }

    @Override
    public void act() {
        System.out.println("名称:"+this.name);
        System.out.println("年龄:"+this.age);
        System.out.print("爱好:");
        this.love();
        System.out.print("技能");
        this.skill();
    }
}
