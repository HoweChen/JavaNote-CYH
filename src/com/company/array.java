package com.company;

/**
 * Created by howechen on 2/16/17.
 */
public class array {
    public static void main(String[] args) {
        int[][][] threeD = new int[3][4][5];
        System.out.println(threeD.length);
        System.out.println(threeD[0].length);
        System.out.println(threeD[0][0].length);


        for (int i = 0; i < threeD.length; i++) {
            for (int j = 0; j < threeD[0].length; j++) {
                for (int k = 0; k < threeD[0][0].length; k++) {
                    threeD[i][j][k] = i * j * k;
                }
            }
        }

        for (int[][] aThreeD : threeD) {
            int j = 0;
            while (j < threeD[0].length) {
                for (int k = 0; k < threeD[0][0].length; k++) System.out.print(aThreeD[j][k] + " ");
                System.out.println();
                j++;
            }
            System.out.println();
        }

        int[][] twoD = new int[4][];

        for (int i = 0; i < twoD.length; i++) {
            twoD[i] = new int[i + 1];
            System.out.println(twoD[i].length);
        }

        System.out.println();

        for (int[] dItr :
                twoD) {
            int i = 0;
            while (i < dItr.length) {
                dItr[i] = 1;
                System.out.print(dItr[i] + " ");
                ++i;
            }
            System.out.println();
        }


    }
}
