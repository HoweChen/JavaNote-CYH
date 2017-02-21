package com.company;

/**
 * Created by howechen on 2/21/17.
 */

class Overload {
    void test() {
        System.out.println("No parameter");
    }

    void test(int oneP) {
        System.out.println("One parameter");
    }

    void test(double oneP, double twoP) {
        System.out.println("Two parameters");
        System.out.println(oneP + " + " + twoP);
    }

    //test with double type not void
    double test(int oneP, int twoP, int threeP) {
        System.out.println("Three parameters");
        return oneP + twoP + threeP;
    }

}

public class MethodOverload {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Overload demo = new Overload();
        demo.test();
        demo.test(0);
        demo.test(0, 0);
        demo.test(0, 0, 0);

    }
}

