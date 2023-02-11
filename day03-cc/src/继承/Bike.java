package 继承;

import javax.swing.*;
import java.awt.*;

public class Bike {
    protected String brand;

    protected String color;

    protected int wheel = 2;

    protected int seat = 1;

    public Bike(){

    }
    public Bike(String brand, String color){
        this.brand = brand;
        this.color = color;
    }
    public Bike(String brand, String color, int wheel, int seat) {
        this.brand = brand;
        this.color = color;
        this.wheel = wheel;
        this.seat = seat;
    }

    public void show() {
        String ret =  "Bike{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", wheel=" + wheel +
                ", seat=" + seat +
                '}';
        System.out.println(ret);
    }
}
