package com.Algo.BinarySearch;

public class InRotatedArray {
    public static void main(String[] args) {
        int[] arr = {8,9,12,15,17,19,20,26,37,39,40,52,62,74,85,96,1,2,3,4,5,6,7};
        int[] arr1 = {1,2,3,4,5,6,7};
        System.out.println(pivot(arr,15));
    }
    static int pivot(int[] arr,int target){
        if(arr[0]<arr[arr.length-1]) return bs(arr,target,0, arr.length-1,0);
        else{
            int start = 0,end=arr.length-1;
            while(start<=end){
                int mid = start +(end-start)/2;
                if(mid<end && arr[mid]>arr[mid+1]) return bs(arr,target,0, arr.length-1,mid);
                if(mid>start && arr[mid] < arr[mid-1]) return bs(arr,target,0, arr.length-1,mid-1);
                if(arr[mid]<= arr[start]) end = mid-1;
                if(arr[mid]>=arr[end]) start = mid;
            }
        }
        return -1;
    }
    static int bs(int[] arr,int target,int start,int end,int pivot){
        if(pivot==0){}
        else if(target>arr[end])end = pivot;
        else if(target<arr[end]) start=pivot;
        else return -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target < arr[mid])end=mid-1;
            else if (target==arr[mid]) return mid;
            else if (target>arr[mid])start=mid+1;
        }
        return -1;
    }
}
