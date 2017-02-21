package com.company;

/**
 * Created by howechen on 2/21/17.
 */

class StaticDemo {
    static int a = 3;
    static int b; // 0 as default

    static void meth(int x) {
        System.out.println("x: " + x);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}

public class StaticKeyword {

    static int a = 3;
    static int b;

    static void meth(int x) {
        System.out.println("x: " + x);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    static {
        System.out.println("Static block initialized");
        b = a * 4;
    }

    public static void main(String[] args) {
        meth(42);
        StaticDemo.meth(3);
    }
}
