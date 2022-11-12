package com.Recursive;

public class FiniteHelloWorld {
    public static void main(String[] args) {
        helo(5);
    }

    private static void helo(int i) {
        if(i>0){
            System.out.println("Hello world: "+(i-(i-1)));
            i--;
            helo(i);
        }
    }
}
