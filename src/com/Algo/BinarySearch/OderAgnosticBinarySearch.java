package com.Algo.BinarySearch;

public class OderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7};
        int[] arr2 = {9,8,7,6,5,4,3};
        System.out.println(oabs(arr2,4));
    }

    static int oabs(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAces = arr[start]<arr[end];
        while(start<=end){
            int mid = start + (end-start)/2;
            if (target==arr[mid]) return arr[mid];
            if(isAces){
                if(target < arr[mid])end=mid-1;
                else if (target>arr[mid])start=mid+1;
            }
            else{
                if(target > arr[mid])end=mid-1;
                else if (target<arr[mid])start=mid+1;
            }
        }
        return -1;
    }
}
