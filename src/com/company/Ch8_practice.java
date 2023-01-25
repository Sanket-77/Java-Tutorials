package com.company;

class cylinder{

    private int height;
    private int radius;

    //constructor =>
    public cylinder(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double surfaceArea(){
        return  2*3.14*radius*radius + 2*3.14*radius*height;
    }
    public double volume(){
        return  3.14*radius*radius*height;
    }

}

public class Ch8_practice {
    public static void main(String[] args) {

        cylinder Mycylinde = new cylinder(12,9);

        Mycylinde.setHeight(12);
        int h = Mycylinde.getHeight();
        System.out.println(h);

        Mycylinde.setRadius(24);
        int r = Mycylinde.getRadius();
        System.out.println(r);

        System.out.println(Mycylinde.surfaceArea());

        System.out.println(Mycylinde.volume());



    }
}
