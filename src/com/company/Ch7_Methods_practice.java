package com.company;

public class Ch7_Methods_practice {

    // problem 1 _ multiplication table
    static void multiplication(int n){
        for (int i=1; i<=10; i++){
            System.out.format("%d X %d = %d\n",n,i,n*i);
        }
    }

    // problem 2 - pattern making
    static void pattern1(int n){
        for (int i=0; i<n; i++){
            for (int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println(  );
        }
    }

    // problem -3 =>  return sum of n natural numbers
    // sum(n) = 1 + 2 + 3 +...+ n
    // sum(n) = 1 + 2 + 3 +...+ n-1 + n
    // sum(n) = sum( n-1 ) + n
    //use recursion
    static int sumRec(int n){
        if ( n == 1){
            return 1;
        }
        return n + sumRec(n-1);
    }

    // problem 4 =>  reverse pattern 1
    static void pattern2(int n){
        for (int i=n-1; i>=0; i--){
            for (int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(  );
        }
    }

    public static void main(String[] args) {

        //1
        //multiplication(3);

        //2
        // pattern1(3);

        //3
        //int l = sumRec(10);
        //System.out.println(l);

        //4
        //pattern2(4);


    }
}
