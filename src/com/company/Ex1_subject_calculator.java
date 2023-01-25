package com.company;

import java.util.Scanner;

public class Ex1_subject_calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Physics marks : ");
        int physics = scan.nextInt();
        System.out.println("Enter your chemistry marks : ");
        int chemistry = scan.nextInt();
        System.out.println("Enter your English marks : ");
        int English = scan.nextInt();
        System.out.println("Enter your Psychology marks : ");
        int Psychology = scan.nextInt();
        System.out.println("Enter your science marks : ");
        int science = scan.nextInt();
        float percentage = (( physics + chemistry + English + Psychology + science)/500.0f)*100;

        System.out.print("percnetage: ");
        System.out.println(percentage);

    }
}
