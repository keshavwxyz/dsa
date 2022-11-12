package com.Recursive;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(actorial(5));
    }

    private static int actorial(int i) {
        if (i == 1) {
            return 1;
        }
        else {
            return(i*actorial(i-1));
        }
    }
}
