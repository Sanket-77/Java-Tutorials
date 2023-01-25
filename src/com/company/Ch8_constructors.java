package com.company;

import java.sql.SQLOutput;

class Myemp{
    private int id;
    private String name;

    public Myemp(){
        id = 50;
        name = "Teknas";
    }
    public Myemp(String Myname, int Myid){  // passing the parameters
        id = Myid;
        name = Myname;
    }


    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id = id;
    }
}


public class Ch8_constructors {

    public static void main(String[] args) {

        Myemp dk = new Myemp("sanket",98);

//        dk.setName("sankey");
//        dk.setId(45);
        System.out.println(dk.getName());
        System.out.println(dk.getId());
    }
}
