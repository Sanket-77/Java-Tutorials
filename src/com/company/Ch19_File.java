package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ch19_File {
    public static void main(String[] args) {

        // Code to create a new file***************************

        File MyFile = new File("Ch19_File.txt");

        try {
            MyFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create this file ");
            throw new RuntimeException(e);
        }

        // Code to write to a file *****************************

        try {
            FileWriter fileWriter = new FileWriter("Ch19_File.txt");
            fileWriter.write("This is first java file created");
            fileWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Reading a file   **************************************

        File MyFile1 = new File("Ch19_File.txt");
        try {
            Scanner  sc  = new Scanner(MyFile1);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        // Deleting File    ***************************************

//        File MyFile2 = new File("Ch19_File.txt");
//        if(MyFile2.delete()){
//            System.out.println("I have deleted: " + MyFile2.getName());
//        }
//        else{
//            System.out.println("Some problem occurred while deleting file");
//        }
    }
}
