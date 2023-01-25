package com.company;

//This is use for run-time polymorphism
//One entity with diff forms

class phone {
    public void greet(){
        System.out.println("Good Morning");
    }
    public void ON(){
        System.out.println("Turning on phone ");
    }
}

class smartphone extends phone{

    public void Welcome(){
        System.out.println(" Welcome ");
    }

    public void ON(){
        System.out.println("Turning on smartphone phone ");
    }
}

public class Ch10_Dynamic_Method_Dispatch {    ///// This is use for run time polymorphism

    public static void main(String[] args) {
//        phone obj = new phone();
//        smartphone smobj = new smartphone();
//        obj.name();

        phone obj = new smartphone();       // Allowed
        obj.greet();
        obj.ON();
        obj.greet();
        // obj.Welcome(); is not allowed

    }
}
