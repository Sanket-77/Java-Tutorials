package com.company;

import java.util.Scanner;

public class Ch3_string {
    public static void main(String[] args) {

        String name = new String("sanket");
        System.out.println(name);
        String name1 = new String("jal");
        System.out.println(name1);

        int a = 6;
        float b = 5.678f;
        System.out.printf("The value a is %5d and value b is %9.2f ", a,b );
        System.out.format(" The value a is %d and value b is %f", a,b );

        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(st);

        String name2 = "shubham";
        String name3 = new String ("prashant");
        System.out.println(name2 + " & " + name3 + " are "  + st +" best friends " );

    }
}
