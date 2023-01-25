package com.company;

public class Ch6_Arrays_practice_set {
    public static void main(String[] args) {
        //practice problem 1
//        float [] marks ={45.7f,67.8f,63.4f,99.2f,100.0f};
//        float sum = 0;
//        for(float elements:marks){
//            sum = sum + elements;
//        }
//        System.out.println("Value of sum is " + sum);



        //problem 2............

        float [] marks ={45.7f,67.8f,63.4f,99.2f,100.0f};
        float num = 45.7f;
        boolean isInArray = false;
        for(float elements:marks){
            if (num == elements){
                isInArray = true;
                break;
            }
        }
        if (isInArray){
            System.out.println("The value is present in the array");
        }
        else{
            System.out.println("The value is not present in the array");
        }

        // problem 3..................
         /*
        float [] marks ={45.7f,67.8f,63.4f,99.2f,100.0f};
        float sum = 0;
        for(float elements:marks){
            sum = sum + elements;
        }
        System.out.println("Value of average marks is " + sum/marks.length);
        */

        //problem 4.....................
        /*
        int [][] mat1 = {{1,2,3},
                        {4,5,6}};
        int [][] mat2 = {{2,6,13},
                        {3,7,1}};
        int [][] result = {{0,0,0},
                            {0,0,0}};

        for(int i = 0;i<mat1.length;i++){    //row number of times
            for(int j = 0;j<mat1[i].length;j++){    //column number of time
                System.out.format("setting value for i=%d and j= %d\n",i,j);
                result [i][j] = mat1[i][j] = mat2[i][j];
            }
        }

        for(int i = 0;i<mat1.length;i++){
            for(int j = 0;j<mat1[i].length;j++){
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(""); // print a new line
        }

         */
        /*//problem 5 reverse the array.....
        int [] arr = {1,2,3,4,5,6};
        int l = arr.length;
        int n = Math.floorDiv(1,2);
        int temp;

        for (int i=0; i<n;i++);{
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = tem;
        }
        for(int element:arr){
            System.out.print(element);
        }*/

        //problem 6............max element in array
//        int [] arr = {1,34,67,98,455,76};
//        int max =0;
//        for (int e:arr){
//            if(e>max){
//                max = e;
//            }
//        }
//        System.out.println("the value of the maximum element in this array is : " +max);
//










    }

}
