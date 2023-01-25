package com.company;

class Base1{
    Base1(){
        System.out.println("I am a Base1 class constructor ");
    }
    Base1(int x){
        System.out.println("I am a Base1 class constructor with value of x as: " + x );
    }
}

class Derived1 extends Base1{
    Derived1(){
        System.out.println("I am a Derived class constructor");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println(" I am a over loaded constructor of derived with value of y as : " + y);
    }
}

class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println(" I am ChildOfDerived constructor");
    }

    ChildOfDerived(int x, int y, int z){
        super(x,y);
        System.out.println("I am an overloaded constructor of Derived with value of z as: " + z);
    }
}

public class Ch9_Constructors_in_Inheritance {

    public static void main(String[] args) {

        //Base1 B1 = new Base1();
        //Derived1 D1 = new Derived1();
        ChildOfDerived cd = new ChildOfDerived(12,34,56);

    }
}

