package com.company;

public class Ch7_VarArgs {

//    static int sum(int a, int b){
//        return a+b;
//    }
//    static int sum(int a, int b,int c){
//        return a+b+c;
//    }
//    static int sum(int a, int b, int c, int d){
//        return a+b+c+d;
//    }

    // instead of return same methods we use VarArg(...arr)
    // same method with diff args
    // varargs

    static int sum(int...arr){
        // Available as int [] arr;
        int result = 0;
        for (int a:arr){
            result+=a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome");
        System.out.println(" The some of 4 and 5 is: "+ sum(4,5));
        System.out.println(" The some of 4 and 5 and 7 is: "+ sum(4,5,7));
        System.out.println(" The some of 4 and 5 and 7 and 9 is: "+ sum(4,5,7,9));

    }
}
