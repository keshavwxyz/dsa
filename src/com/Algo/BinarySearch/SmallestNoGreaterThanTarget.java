package com.Algo.BinarySearch;

public class SmallestNoGreaterThanTarget {
    public static void main(String[] args) {
        char[] arr = {'c','f','j'};
        System.out.println(sn(arr,'a'));
    }
    static char sn(char[] arr, char target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target < arr[mid])end=mid-1;
            else if (target==arr[mid]) return arr[mid+1];
            else if (target>arr[mid])start=mid+1;
        }
        return arr[0];
    }
}
