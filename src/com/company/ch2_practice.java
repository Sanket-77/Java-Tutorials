package com.company;

public class ch2_practice {
    public static void main(String[] args) {

        System.out.println(" s ");
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);

        grade = (char)(grade + 4);
        System.out.println(grade);

        // decrypting the grade
        grade = (char)(grade - 8);
        System.out.println(grade);

        //4
        int v = 5;
        int u = 8;
        int a = 10;
        int s = 6;
        float z = ((v*v-u*u)/(2*a*s));
        System.out.print("Z = " + z);

        System.out.println(7*49/7+35/7);

    }
}
