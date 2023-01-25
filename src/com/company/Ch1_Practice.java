package com.company;

import java.util.Scanner;

public class Ch1_Practice {
    public static void main(String[] args) {

        // Tacking inputs from system-

        //question1 cgpa
        int subject1 = 45;
        int subject2 = 83;
        int subject3 = 67;
        int cgpa = (subject1 + subject2 + subject3)/30;
        System.out.println(cgpa);

        //question 2
        System.out.println("what is your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("hello "  +  name  +  " have good day!");

        //question 3
        System.out.println("Enter your number: ");
        Scanner nu = new Scanner(System.in);
        System.out.println(nu.hasNextInt());

        System.out.println("who are you");
        Scanner h = new Scanner(System.in);
        String sk = h.next();
        System.out.println("Hello "+ sk + " How are you");
        Scanner t = new Scanner(System.in);
        String M = t.nextLine();
        System.out.println( M + " Good, Have Good Day");















    }
}
