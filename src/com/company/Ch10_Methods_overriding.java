package com.company;

// Method is override when override method has same parameters and same return type

class A{
    public int sanket(){
        return 4;
    }

    public void Meth2(){
        System.out.println("I  am method 2 of class A");
    }
}
class B extends A{
    @Override                ////// override method //////////////
    public void Meth2(){
        System.out.println("I  am method 2 of class B");
    }
    public void Meth3(){
        System.out.println("I  am method 3 of class B");
    }
}

public class Ch10_Methods_overriding {
    public static void main(String[] args) {
        A a = new A();
        a.Meth2();

        B b = new B();
        b.Meth2();

    }
}
