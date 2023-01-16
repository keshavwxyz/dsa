package com.arrays;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSeries {
    public static void main(String[] args) {
        ArrayList<Integer> arr =new ArrayList<>();
        fab(arr,15);
        System.out.println(arr);
    }

    public static void fab(List<Integer> arr, int i) {
        arr.add(0);
        arr.add(1);
        int n1 = 0, n2 = 1;
        while(i>0) {
            int temp = n2;
            n2 = n2 + n1;
            n1 = temp;
            arr.add(n2);
            i--;
        }
    }
}
