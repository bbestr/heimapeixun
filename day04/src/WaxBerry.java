public final class WaxBerry extends Fruits{
    private String color;
    private String shape;
    private String taste;

    public WaxBerry(String color,String shape,String taste){
        super("圆形","酸酸甜甜");
        this.color = color;
    }

    public final void face(){
        System.out.println("杨梅算算天天");
    }
    @Override
    public void eat() {
        System.out.println("杨梅酸酸甜甜很好吃!  ");
    }

    @Override
    public String toString() {
        return "WaxBerry{" +
                "color='" + color + '\'' +
                ", shape='" + shape + '\'' +
                ", taste='" + taste + '\'' +
                '}';
    }
}
