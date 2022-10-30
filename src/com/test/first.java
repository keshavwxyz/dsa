package com.test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static com.learn.function.fun;

public class first {
    public static void main(String[] args) {
        fun();
        for (int i = 0; i < 9; i++) {

        }
        VarArgu(1,32,43,56,767,878,98);
    }

    static void VarArgu(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
