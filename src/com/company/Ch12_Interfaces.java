package com.company;

/*
 Interface is point where two system meet and interact.
 In java => Interface is group of related methods with empty bodies.
 // we can extends only one abstract class. but we implement multiple interface
*/

interface Bicycle{
    int A = 12;
    void applyBreaks(int decrement);
    void speedup(int increment);
}

class AvonCycle implements Bicycle{
    void blowHorn(){
        System.out.println("Horn pleas");
    }
    public void applyBreaks(int decrement){
        System.out.println("Applying Break");
    }
    public void speedup(int increment){
        System.out.println("Applying speedup");
    }
}

public class Ch12_Interfaces {
    public static void main(String[] args) {
        AvonCycle Ac = new AvonCycle();

        Ac.applyBreaks(2);
        // You can create properties in interface
        System.out.println(Ac.A);
        // But you cannot modify the property
        //Ac.A = 23;  because this is final variable

    }

}
