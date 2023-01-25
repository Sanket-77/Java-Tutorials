package com.company;

import java.util.*;
public class Ch17_ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> l1= new ArrayList<>();
        ArrayList<Integer>l2= new ArrayList<>(5);
        l2.add(11);
        l2.add(12);
        l2.add(13);
        l2.add(14);
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(1);
        l1.add(5);
        l1.add(0,4);
        l1.add(2,9);
        l1.addAll(l2);
        l1.subList(2,4);
        System.out.println(l1);
        for (int i=0; i<l1.size(); i++){
            System.out.println(l1.get(i));
        }
    }
}
