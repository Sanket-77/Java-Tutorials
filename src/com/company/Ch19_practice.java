package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ch19_practice {
    public static void main(String[] args) {

        // create file name multiplication table

        File cf = new File("MultiplicationTable.txt");
        try {
            cf.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create this file ");
            throw new RuntimeException(e);
        }

        // Write multiplication table in file

        int i = 7;
        String table = "";
        for (int j = 0; j < 10; j++) {
            table += i + "X"+(j+1) + "=" + i*(j+1);
            table += "\n";
        }
        try {
            FileWriter fileWriter = new FileWriter("MultiplicationTable.txt");
            fileWriter.write(table);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
