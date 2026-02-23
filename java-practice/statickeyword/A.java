package com.practice.statickeyword;

public class A {

    int a;

    public void method1(final int a){

      //  a = 34;  // --> gives error "Cannot assign a value to final variable 'a' " because a is final.
        System.out.println("Print " + a);
    }
}
