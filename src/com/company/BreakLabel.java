package com.company;

/**
 * Created by howechen on 2/20/17.
 */
public class BreakLabel {
    public static void main(String[] args){
        boolean t = true;
        first:{
            second:{
                third:{
                    if (t){
                        System.out.println("Hello world then break");
                        break second;
                    }
                }
                System.out.println("This line won't be printed");
            }
            System.out.println("I am in the first label");
        }
    }
}
