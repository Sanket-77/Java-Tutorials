package com.company;

public class Ch7_Methods {

    //Method
    static int logic(int x, int y){
        int z;
        if (x>y){
            z = x + y;
        }
        else {
            z = (x + y)* 5;
        }
        return z;
    }

    public static void main(String[] args) {

        System.out.println(" Methods ");

        int a = 5;
        int b = 7;
         int c;
         c = logic(a,b);

         int a1 = 2;
         int b1 = 1;
         int c1;
         c1 = logic(a1, b1);
        System.out.println(c);
        System.out.println(c1);
        System.out.println(logic(23,56));

        // Methods over-loading
        // Methods with same name but different parameters

    }
}
