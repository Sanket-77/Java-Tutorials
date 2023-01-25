package com.company;

interface sampleInterface{
    void meth1();
    void meth2();
}
interface childSampleInterface extends sampleInterface{
    void met3();
    void meth4();
}

class mySampleClass implements childSampleInterface{

    @Override
    public void meth1() {
        System.out.println("Meth1");
    }

    @Override
    public void meth2() {
        System.out.println("Meth2");
    }

    @Override
    public void met3() {
        System.out.println("Meth3");
    }

    @Override
    public void meth4() {
        System.out.println("Meth4");
    }
}
public class Ch13_inheritance_in_interface {
    public static void main(String[] args) {
        mySampleClass obj = new mySampleClass();
        obj.meth1();
        obj.meth2();
        obj.met3();
        obj.meth4();

    }
}
