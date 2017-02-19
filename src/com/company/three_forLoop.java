package com.company;

/**
 * Created by howechen on 2/20/17.
 */
public class three_forLoop {
    public static void main(String[] args) {
        int[][] twoD = new int[3][5];

        int count = 0;
        for (int[] x : twoD) {
            for (int y : x) {
                System.out.println(++count + ": Hello World");
            }
        }

    }
}
