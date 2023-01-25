package com.company;

// we can not make object of abstract class
// abstract class is used to provide common method implementation to all the subclasses.
// or to provide default implementation.

abstract class parent2{
    public parent2(){
        System.out.println("I am constructor of parent2 ");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}

class child2 extends parent2{
    @Override
    public void greet() {
        System.out.println("Good Morning");
    }
}
abstract class child3 extends  parent2{
    public void th(){
        System.out.println("How are you ");
    }
}

public class Ch11_Abstract {
    public static void main(String[] args) {
        child2 c = new child2();
        //parent2 p = new parent2();     // we can not make object of abstract class

    }
}
