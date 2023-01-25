package com.company;

public class Ch5_Loops {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);

        System.out.println("Using loop.................");

        int i = 1;
        while (i<=10){
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
        System.out.println("Finished running while loop!");


        // do while loop.......................

        int b = 0;
        do {
            System.out.println(b);
            b++;
        } while(b>10);

        System.out.println("Finished running while loop!");

        int c = 1;
        do {
            System.out.println(c);
            c++;
        }while (c<=45);


    }
}
