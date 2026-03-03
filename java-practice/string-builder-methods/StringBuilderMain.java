package com.practice.stringbuilder;

public class StringBuilderMain {

    public static void main(String[] args) {

        String string = "StringBuildermethods";

        StringBuilderMethods obj = new StringBuilderMethods();

        obj.method_append("Hello"," World ! ");
        System.out.println();

        obj.method_insert(string);
        System.out.println();

        obj.method_delete(string);
        System.out.println();

        obj.method_deletecharAt(string);
        System.out.println();

        obj.method_replace("Superman");
        System.out.println();

        obj.method_reverse("racecar");
        System.out.println();

        obj.method_length("This String length is 24");
        System.out.println();

        obj.method_capacity();
        System.out.println();

    }

}
