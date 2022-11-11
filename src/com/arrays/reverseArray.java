package com.arrays;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {1,23,3,64,34,65,35,23,54};
        System.out.println(Arrays.toString(reverse(arr)));
    }
    static int[] reverse(int[] a){
        int[] l = new int[a.length];
        for (int i = a.length-1; i >= 0; i--) {
            l[a.length-i-1] = a[i];
        }
        return l;
    }
}
