package 小项目;

public class Joker implements InterfaceAct{

    private String name;

    private int year;

    public Joker(String name, int year) {
        this.name = name;
        this.year = year;
    }
    public void describe(){
        System.out.println("着装: 身穿五彩衣服,头上戴着彩色的帽子,脸上画着夸张的彩妆");
    }

    @Override
    public void skill() {
        System.out.println("脚踩高跷,进行杂技魔术表演");
    }

    @Override
    public void act() {
        System.out.println("表演者:"+this.name);
        System.out.println("艺龄:"+this.year);
        this.describe();
        System.out.print("技能:");
        this.skill();
    }
}
