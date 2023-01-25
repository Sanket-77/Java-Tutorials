package com.company;

class Base{
    int x;
    public void setX(int x) {
        System.out.println("I am in Base and setting x");
        this.x = x;
    }
    public int getX() {
        return x;
    }

    public void printMe(){
        System.out.println("I am Base class constructor");
    }
}
class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Ch9_Inheritance {
    public static void main(String[] args) {

        // Creating an object of base class
        Base b = new Base();
        b.setX(4);
        System.out.println("x => "+ b.getX());

        // Creating an object of Derived class
        Derived D = new Derived();
        D.setX(45);
        System.out.println(D.getX());
    }
}
