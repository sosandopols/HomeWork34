package oop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class bouquetOfFlowers {


    private String name;
    private double price;

    private String color;
    private  boolean condition;// состояние
    private double lengths;
    private int freshness;//0-3
    public bouquetOfFlowers(String name,double price, String color, boolean condition, double lengths,int freshness) {
        this.name=name;
        this.price = price;
        this.color = color;
        this.condition = condition;
        this.lengths = lengths;
        this.freshness = freshness;
    }

    public int getFreshness() {
        return freshness;
    }

    public void setFreshness(int freshness) {
        this.freshness = freshness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCondition() {
        return condition;
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }

    public double getLengths() {
        return lengths;
    }

    public void setLengths(double lengths) {
        this.lengths = lengths;
    }

    @Override
    public String toString() {
        return "bouquetOfFlowers{" +
                "name=" + name +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", condition=" + condition +
                ", lengths=" + lengths +
                ", freshness=" + freshness +
                '}';
    }
    public void printfFlower(){
        System.out.println("i am flower");
    }
}


