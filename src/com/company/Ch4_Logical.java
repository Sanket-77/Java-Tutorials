package com.company;

import java.util.Scanner;

public class Ch4_Logical {
    public static void main(String[] args) {

        // For logical AND
        System.out.println(" For logical AND ");
        Boolean a = false;
        Boolean b = false;
        Boolean c = false;
        if ( a  && b  && c ){
            System.out.println("y");
        }
        else
            System.out.println("N");

        //For Logicsl OR
        System.out.println(" For logical OR ");
        //Boolean a1 = true;
        //Boolean b1 = true;
        //Boolean c1 = true;
        if ( a || b || c){
            System.out.println("y");
        }
        else
            System.out.println("N");


        //For Logical not
        System.out.println("for logical not");
        System.out.print("Not(A) is ");
        System.out.println(!a);


        // if condition
        //int age = 56;
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age>56){
            System.out.println("Your Experianced!");
        }
        else if (age>46){
            System.out.println("You are semi-Experianced!");
        }
        else if (age>36){
            System.out.println("you are semi semi experianced");
        }
        else{
            System.out.println("You are less experinced");
        }

        //switch case statements
        switch (age) {
            case 18 -> System.out.println("you are going to become adult!");
            case 23 -> System.out.println("You are going to join job!");
            case 68 -> System.out.println("You are going to get retired!");
            default -> System.out.println("Enojoy your life!");
        }
        System.out.println("Thanks for using my java code!");

        // practice question 1

        byte m1,m2,m3;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter your marks in physics");
        m1 = Sc.nextByte();
        System.out.println("Enter your marks in Chemistry");
        m2 = Sc.nextByte();
        System.out.println("Enter your marks in psychology");
        m3 = Sc.nextByte();
        float avg = (m1 + m2+ m3)/3.0f;
        System.out.println("Your overall percentage is: " + avg);
        if (avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Congratulations you are pass!");
        }
        else{
            System.out.println("Sorry you are fail");
        }

        //question 2
        //calculate income tax
        /*float tax = 0;
        float income = 3.3f;
        if (tax<2.5f){
            tax = tax + 0;
        }
        else if (tax>2.5f && tax<5f){
            tax = tax + 0.05f * (income-2.5f);
        }
        else if (tax>5f && tax<10f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
        }
        else if (tax>10.0f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.05f * (10.0f - 5f);
            tax = tax + 0.2f * (income - 10.0f);
        }*/


        //Question 4
        System.out.println("Enter number!");
        Scanner dc = new Scanner(System.in);
        int day = dc.nextInt();
        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("Sunday");
        }

        //Question 5
        //find out type of web
        System.out.println("Enter a website name: ");
        Scanner ws = new Scanner(System.in);
        String Website = ws.next();
        if(Website.endsWith(".org")){
            System.out.println("This is organizational website");
        }
        else if(Website.endsWith(".com")){
            System.out.println("This is commercial website");
        }
        else if(Website.endsWith(".in")){
            System.out.println("This is indian website");
        }

        // year to be checked
        System.out.println("Enter a year: ");
        Scanner y = new Scanner(System.in);
        int year = y.nextInt();

        if (((year % 4 == 0) && (year % 100 != 0)) ||(year % 400 == 0)){
            System.out.println("Specified year is leap year ");
        }
        else{
            System.out.println("Specified year is not leap year");
        }

        // question
        // rock pepper sizer game program



    }
}
