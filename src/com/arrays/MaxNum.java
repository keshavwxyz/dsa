package com.arrays;

public class MaxNum {
    public static void main(String[] args) {
        int[] arr = {1,3,6,33,65,23,57,34};
        System.out.println(maxnum(arr));
        System.out.println(maxnumInRange(arr,1,3));
    }

    private static int maxnumInRange(int[] arr, int start, int end) {
        int a=arr[0];
        for (int i = start; i < end; i++) {
            if (a<arr[i]) {
                a=arr[i];
            }
        }
        return a;
    }

    static int maxnum(int[] arr){
        int a=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (a<arr[i]) {
                a=arr[i];
            }
        }
        return a;
    }
}
