package com.Algo.BinarySearch;

public class MountainSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,9,10,11,25,8,7,6,5,4,3};
        System.out.println(ms(arr,4));
    }
    static int ms(int[] arr,int target){
        int peak = pima(arr);
        int firsttry = oabs(arr,target,0,peak);
        if(firsttry!=-1)return firsttry;
        int sectry = oabs(arr,target,peak,arr.length-1);
        if(sectry!=-1)return sectry;
        return -1;
    }
    static int oabs(int[] arr, int target,int start ,int end){
        boolean isAces = arr[start]<arr[end];
        while(start<=end){
            int mid = start + (end-start)/2;
            if (target==arr[mid]) return mid;
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
    static int pima(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]<arr[mid+1])start=mid+1;
            else if (arr[mid]<arr[mid-1])end=mid;
            else return mid;
        }
        return -1;
    }
}
