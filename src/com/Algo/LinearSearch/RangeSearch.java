package com.Algo.LinearSearch;

public class RangeSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,32,43,5423,23,43,5,42,324,234,245,34};
        System.out.println(RS(arr,5423,2,4));
    }

    private static boolean RS(int[] arr, int i,int o,int p) {
        for(int l=o;l<=p;l++){
            if(i==arr[l]) return true;
        }
        return false;
    }
}
