package com.company;

public class Ch5_Loops_practice_set {
    public static void main(String[] args) {

        // practice problem 1
        int n = 10;
        for(int i=n; i>0; i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        //practice problem 2
        //sum of even number using while loop

        int sum = 0;
        int n1 = 5;
        for(int i=0;i<n1;i++){
            sum = sum + (2+1);
        }
        System.out.print("Sum of even number is: ");
        System.out.println(sum);


        //practice problem 3
        //multiplication table of 5
        int n2=5;
        for(int i=1; i<=10;i++){
            System.out.printf("%d X %d = %d\n",n2,i, n*i);
        }

        // practice problem 4
        //multiplication table of 10 in reverse order

//        int n=10;
//        for (int i =10; i>=1; i--){
//            System.out.printf("%d * %d = %d\n",n,i,n*i);
//        }

        // practice problem 6
        //factorial
//        int n = 5;
//        int i =1;
//        int factorial =1;
//        while(i<=n){
//            factorial *=1;
//            i++;
//        }
//        System.out.println(factorial);

        //practice problem 7
        //sum of 8 table
//        int n = 8;
//        int sum = 0;
//        for(int i = 0; i<=10;i++){
//            sum += n*i;
//        }
//        System.out.println(sum);
    }
}
