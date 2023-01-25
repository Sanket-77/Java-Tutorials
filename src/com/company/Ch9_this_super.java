package com.company;

// This. is reference variable that refer to current object

// This  is used to call current class constructor
// super is used to call base class constructor

class classOne{
    int a;
    public int getA() {
        return a;
    }
    public classOne(int a){
        this.a = a;
    }
}

public class Ch9_this_super {

    public static void main(String[] args) {

        classOne Ec = new classOne(4);
        System.out.println(Ec.getA());
    }
}
