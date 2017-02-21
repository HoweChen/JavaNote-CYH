package com.company;

/**
 * Created by howechen on 2/20/17.
 */

class Box {

    double width;
    double height;
    double depth;
    double vol;

    public Box(double width, double height, double depth) {
        System.out.println("Constructing Box");
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.calculateVol();
    }

    public Box(Box box) {
        this.width = box.width;
        this.height = box.height;
        this.depth = box.depth;

        box.vol += 10_000;
    }

    public void calculateVol() {
        this.vol = this.depth * this.width * this.height;
    }

    public void volume() {
        System.out.println("Volume: " + this.vol);
    }

    public Box increaseByTen() {
        Box newBox = new Box(this.width + 10, this.height + 10, this.depth + 10);
        System.out.println(newBox.width);
        return newBox;
    }
}

class Stack {
    private int[] stack;
    private int flag;

    public Stack(int size) {
        if (size <= 0) {
            System.out.println("Cannot set a negative size of a stack");
        } else {
            this.stack = new int[size];
            this.flag = 0;
        }
    }

    public void push(int element) {
        if (this.flag >= this.stack.length - 1) {
            System.out.println("The stack is already full and the element cannot be pushed into it.");
        } else {
            this.stack[this.flag] = element;
            ++this.flag;
            System.out.println(element + "has been pushed");
        }

    }

    public int pop(int element) {
        if (this.flag < 0) {
            System.out.println("The stack has been empty and cannot be popped");
        } else {
            return this.stack[flag--];
        }
        return element;
    }

    public void show_stack() {
        for (int itr :
                stack) {
            System.out.println(itr);
        }
    }


}

public class classKeyword {


    public static void main(String[] args) {
        Box myBox = new Box(10, 20, 15);
        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;


        myBox.calculateVol();
//        System.out.println(String.valueOf(myBox.vol)); //3000.0
        myBox.volume();

        //myBox and myBox2 would be pointed to the same object instance
        Box myBox2 = myBox;
        myBox2.vol = 0;
        myBox.volume();
        myBox2.volume();
//        System.out.println(String.valueOf(myBox2.vol)); //0.0
//        System.out.println(String.valueOf(myBox.vol)); //0.0


        //create a new box as a copy of myBox, deep copy
        Box myBox3 = new Box(myBox);
        myBox3.volume(); // 0.0
        myBox.volume();//10_000 because
        // create an object of a class is a reference calling, calling one object as parameter is still a value-calling
        // operation.
        // but this parameter is a reference to an object, so that it would change the object if you modify the parameter.
        // which means: value and object as parameter is value-calling, but object is a reference-calling.

        Box myBox4 = myBox3.increaseByTen();
        myBox4.volume(); // 15_000
    }
}

class BoxDemo2 {
    public static void main(String[] args) {
        System.out.println("Test");
    }
}

class stackDemo {
    public static void main(String[] args) {
        System.out.println("Stack Test Demo");

        Stack stackTest = new Stack(5);
        stackTest.show_stack();
    }
}
