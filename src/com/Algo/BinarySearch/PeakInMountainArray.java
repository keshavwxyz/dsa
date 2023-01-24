package com.Algo.BinarySearch;

public class PeakInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,9,10,11,25,8,7,6,5,4,3};
        System.out.println(pima(arr));
    }
    static int pima(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]<arr[mid+1])start=mid+1;
            else if (arr[mid]<arr[mid-1])end=mid;
            else return arr[mid];
        }
        return -1;
    }
}
