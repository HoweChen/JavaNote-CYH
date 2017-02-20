package com.company;

/**
 * Created by howechen on 2/20/17.
 */
public class returnKeyword {
    public static void main(String[] args) {
        boolean t = true;
        if (t) {
            return;
        } else {
            System.out.println("This is won't be executed");
        }
    }
}
