package com.company;

public class Ch6_Arrays {
    public static void main(String[] args) {

        //class of 5 students
//        int[] marks = new int[5];
//        marks[0] = 100;
//        marks[1] = 64;
//        marks[2] = 78;
//        marks[3] = 89;
//        marks[4] = 98;
//        System.out.println(marks[4]);

//        int [] marks = {97,65,76,97,76};
//        System.out.println(marks[3]);

        //practice for Array.............................

//        float [] marks = {87.8f,85.9f,93.4f,97.0f,87.8f};
//        String [] Student = {"sanket","prashant","Shubham","pratic","sumit"};
//        System.out.println(Student.length);
//        System.out.println(Student[3]);

        /*int [] marks = {98,87,97,56,56};
        System.out.println(marks.length);

        //displaying the array (Naive way)
//        System.out.println("Printing using navie way");
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);
//        System.out.println(marks[4]);

        //Displaying the array (For loop )
        //int [] marks = {98,87,97,56,56};
        System.out.println("Printing using for loop ");
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }

        //Displaying the arrays in reverse order
        for(int i =marks.length -1;i>=0;i--){
            System.out.println(marks[i]);
        }*/

        //multidimensional arrays............
        //Displaying 1 D arrays.............

        int [][] flats;
        flats = new int[2][3];
        flats [0][0] = 101;
        flats [0][1] = 102;
        flats [0][2] = 103;
        flats [1][0] = 201;
        flats [1][1] = 201;
        flats [1][2] = 201;

        //Displaying 2 D arrays................
        System.out.println("Displaying 2 D arrays using for loop");
        for (int i = 0; i<flats.length;i++){
            for(int j=0; j<flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}