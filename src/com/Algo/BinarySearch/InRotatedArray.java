package com.Algo.BinarySearch;

public class InRotatedArray {
    public static void main(String[] args) {
        int[] arr = {8,9,12,15,17,19,20,26,37,39,40,52,62,74,85,96,1,2,3,4,5,6,7};
        int[] arr1 = {1,2,3,4,5,6,7};
        System.out.println(bs(arr,15));
    }
    static int pivot(int[] arr){
        int end = arr.length-1,start=0,mid;
        if(arr[start]<arr[end])return -1;
        while(start<=end){
            mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1])return mid;
            else if(arr[mid]<arr[mid-1])return mid-1;
            else if(arr[mid]<arr[start])end=mid;
            else if(arr[mid]>arr[end])start=mid+1;
        }
        return -1;
    }
    static int bs(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        if(pivot(arr)!=-1){
            start = 0;
            end = arr.length-1;
        }
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target < arr[mid])end=mid-1;
            else if (target==arr[mid]) return arr[mid];
            else if (target>arr[mid])start=mid+1;
        }
        return -1;
    }
}
