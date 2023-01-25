package com.company;

abstract class pen{
    abstract void write();
    abstract void refill();
}

class founterpen extends pen {

    @Override
    void write() {
        System.out.println("Write");
    }

    @Override
    void refill() {
        System.out.println("refill");
    }

    void changenib(){
        System.out.println("Changing the nib");
    }
}
///////////////////////////////////////////
class  monky{
    void jump(){
        System.out.println("Jumping ");
    }

    void bite(){
        System.out.println("Bite");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}

class human extends  monky {
    void speak(){
        System.out.println("Hello ");
    }

}


public class Ch14_practice {
    public static void main(String[] args) {
        founterpen obj = new founterpen();
        obj.changenib();
    }
}
