package com.Algo.BinarySearch;

public class NoCeiling {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,7,8,12,16,19,20};
        System.out.println(nc(arr,13));
    }
    static int nc(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int mid =0;
        while(start<=end){
            mid = start + (end-start)/2;
            if(target < arr[mid])end=mid-1;
            else if (target==arr[mid]) return arr[mid];
            else if (target>arr[mid])start=mid+1;
        }
        return arr[mid+1];
    }
}
