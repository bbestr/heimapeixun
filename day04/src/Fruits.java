import java.util.Objects;

public class Fruits {
    private String shape;

    private String taste;

    public Fruits(){

    }

    public Fruits(String shape, String taste) {
        this.shape = shape;
        this.taste = taste;
    }

    public void eat(){
        System.out.println("水果可供人们食用");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruits fruits = (Fruits) o;
        return shape.equals(fruits.shape) && taste.equals(fruits.taste);
    }

}
