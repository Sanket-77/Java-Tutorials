package com.company;

public class Ch3_String_methods {
    public static void main(String[] args) {

        //string are immutable.....................
        String name = "sanket";
        System.out.println(name);

        // length..................
        int value = name.length();
        System.out.println(value);

        //lowercase and uppercase....................
        String Ustring = name.toUpperCase();
        System.out.println(Ustring);

        //Trim
        String nontrimmedstring = "      sanket      ";
        System.out.println(nontrimmedstring);
        String trimmedstring = nontrimmedstring.trim();
        System.out.println(trimmedstring);

        //replace
        String text = "To Lower Case";
        text = text.replace(" ","_");
        System.out.println(text);

        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>","Sanket");
        System.out.println(letter);

        //name .substring
        System.out.println(name.substring(2,5));

        // char at
        String name2  = "sanket";
        System.out.println(name.charAt(3));

        // index of and  last index of
        System.out.println(name.indexOf("t"));

        String modifiedName = "shivshankar";
        System.out.println(modifiedName.indexOf("sha",1));

        //equals
        System.out.println(name2.equals("sanket"));
        System.out.println(name2.equalsIgnoreCase("Sanket"));



        //Escape sequence
        System.out.println("I am escape sequence\n double quote");

    }
}
