package com.company;

/**
 * Created by howechen on 3/3/17.
 */
public class VarargsTest {
    static void vaTestOne(int[] v) {
        System.out.println("Using traditional way.");
        System.out.print("Number of args: " + v.length + " Contents: ");
        for (int x :
                v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void vaTestTwo(int... v) {
        System.out.println("Using varargs keyword.");
        System.out.print("Number of args: " + v.length + " Contents: ");
        for (int x :
                v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // overload method vaTestTwo to support boolean variable
    static void vaTestTwo(boolean... v) {
        System.out.println("Using varargs keyword to test boolean.");
        System.out.print("Number of args: " + v.length + " Contents: ");
        for (boolean x :
                v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a1 = {10};
        int[] a2 = {0, 1, 2};
        int[] a3 = {};

        vaTestOne(a1);
        vaTestOne(a2);
        vaTestOne(a3);
        System.out.println();
        vaTestTwo(10);
        vaTestTwo(0, 1, 2);
        vaTestTwo(true, false, false);
        // cannot be used since the method has been overloaded and compiler doesn't know which method to use.
//        vaTestTwo();


    }
}
