package com.company;

class circle{
    public int radius;
    circle(int r){
        System.out.println("I am circle parameterized constructor ");
        this.radius = r;
    }

    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class cylinder1 extends circle{
    public int Height;

    cylinder1(int r,int h ) {
        super(r);
        System.out.println("I am cylinder1 parameterized constructor ");
        this.Height = h;
    }

    public double volume (){
        return Math.PI*this.radius*this.radius * Height;
    }
}

public class Ch10_practice {
    public static void main(String[] args) {
        //circle objc = new circle(12);
        cylinder1 objcl = new cylinder1(12,3);
    }
}
