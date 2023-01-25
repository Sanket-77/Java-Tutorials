package com.company;

public class Ch5_for_loop {
    public static void main(String[] args) {

//        System.out.println("for loop practice!");
//        int n =20;
//        for (int i = 0; i<n; i++){
//            System.out.println(2*i);
//        }
//
//        for (int i=100; i>0; i--){
//            System.out.println(i);
//        }


        // break and continue in loops
//        for (int i=0; i<50; i++){
//            System.out.println(i);
//            System.out.println("java is great");
//            if (i==4){
//                System.out.println("Ending the ;loop");
//                break;
//            }
//        }

//        int i= 0;
//        while(i<5){
//            System.out.println(i);
//            System.out.println("java is great");
//            if (i==4){
//                System.out.println("Ending the loop");
//                break;
//            }
//            i++;
//        }
//        System.out.println("Loop end here");

        //do while continue

        int i = 0;
        do{
            i++;
            if(i==5){
                System.out.println("Ending the loop here");
                continue;
            }
            System.out.println(i);
            System.out.println("Java id great");

        }while(i<10);
        System.out.println("Loop ends here");
    }
}
