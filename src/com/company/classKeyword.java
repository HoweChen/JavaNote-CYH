package com.company;

/**
 * Created by howechen on 2/20/17.
 */

class Box {
    double width;
    double height;
    double depth;
    double vol;

    public void calculateVol() {
        this.vol = this.depth * this.width * this.height;
    }
}

public class classKeyword {


    public static void main(String[] args) {
        Box myBox = new Box();
        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;


        myBox.calculateVol();
        System.out.println(String.valueOf(myBox.vol)); //3000.0


        //myBox and myBox2 would be pointed to the same object instance
        Box myBox2 = myBox;
        myBox2.vol = 0;
        System.out.println(String.valueOf(myBox2.vol)); //0.0
        System.out.println(String.valueOf(myBox.vol)); //0.0


    }
}

class BoxDemo2 {
    public static void main(String[] args) {
        System.out.println("Test");
    }
}
