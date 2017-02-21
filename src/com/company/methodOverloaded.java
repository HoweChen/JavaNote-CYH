package com.company;

/**
 * Created by howechen on 2/21/17.
 */

class Overloaded {
    void test() {
        System.out.println("No parameter");
    }

    void test(int oneP) {
        System.out.println("One parameter");
    }

    void test(int oneP, int twoP) {
        System.out.println("Two parameters");
    }

    //test with double type not void
    double test(int oneP, int twoP, int threeP) {
        System.out.println("Three parameters");
        return oneP + twoP + threeP;
    }

}

public class methodOverloaded {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Overloaded demo = new Overloaded();
        demo.test();
        demo.test(0);
        demo.test(0, 0);
        demo.test(0, 0, 0);

    }
}

