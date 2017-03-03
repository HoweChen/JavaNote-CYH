package com.company;

/**
 * Created by howechen on 2/21/17.
 */

public class NestedClass {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        void display() {
            System.out.println("Inner Display: outer_x: " + outer_x);
        }
    }

    public static void main(String[] args) {
        NestedClass nestedClass = new NestedClass();
        nestedClass.test();
    }
}
