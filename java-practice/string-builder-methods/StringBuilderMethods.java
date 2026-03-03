package com.practice.stringbuilder;

public class StringBuilderMethods {


    void method_append(String str, String str1){

        StringBuilder sb = new StringBuilder(str);
        sb.append(str1);
        System.out.println(sb);
    }

  
    void method_insert(String str){

        StringBuilder sb = new StringBuilder(str);
        sb.insert(13,"-");
        System.out.println(sb);
    }

    void method_delete(String str){

        StringBuilder sb = new StringBuilder(str);
        sb.delete(13,13);         // delete() method requires 2 int values [ range ]
        System.out.println(sb);
    }

  
    void method_deletecharAt(String str){

        StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt(2);         // deletes character at specified index
        System.out.println(sb);
    }

  
    void method_replace(String str){

        StringBuilder sb = new StringBuilder(str);
        sb.replace(0,5,"Bat" );    // replace() --> sb.replace(start indx , last indx+1, "String to be replaced")
        System.out.println(sb);

        // Note - For StringBuilder whenever there is a range parameter take end range +1 (see above exmaple)
    }


    void method_reverse(String str){

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();    //    reverse() --> reverses a String directly
        System.out.println("The reversed String is " + "\"" +sb+ "\"");
        if (sb.toString().equals(str)) {       // important line - convert back to string type and then use equals().
            System.out.println("This is a palindrome ");
        }
        else {
            System.out.println("This is NOT a palindrome");
        }
    }


    void method_length(String str){
        System.out.println("String length :  " + str.length());
    }

    void method_capacity(){
        StringBuilder sb = new StringBuilder(40);
        System.out.println(sb.capacity());        // capacity() returns the int value of remaining OR available capacity

        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1.capacity()); // Prints 16

        StringBuilder sb2 = new StringBuilder(40);
        System.out.println(sb2.capacity()); // Prints 40

        StringBuilder sb3 = new StringBuilder("Java");
        System.out.println(sb3.capacity()); // Prints 20 (4 chars + 16 default)
    }

}
