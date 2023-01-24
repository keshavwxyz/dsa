package com.Algo.BinarySearch;

public class RotatedArrayWithDuplicate {
    public static void main(String[] args) {
        int[] arr = {8,8,8,9,9,9,9,9,9,10,12,12,12,12,12,12,15,15,15,15,17,
                19,19,19,19,19,19,20,1,2,2,2,2,2,2,3,3,3,3,3,3,3,4,5,6,7};
        int[] arr1 = {2,2,2,2,9,2,2};
        int target = 12;
        System.out.println(pawd(arr,target));
        System.out.println("The first one is at index: "+FirstIndex(arr,target));
    }
    static int FirstIndex(int[] arr,int target){
        int mid=pawd(arr,target);
        while(arr[mid]==arr[mid-1]){
            mid-=1;
        }
        return mid;
    }
    static int pawd(int[] arr,int target){
        int start = 0,end=arr.length-1;
        while(arr[start]==arr[end]){
            start += 1;
            end -= 1;
        }
        return pivot(arr,target,start,end);
    }
    static int pivot(int[] arr,int target,int start,int end){
        if(arr[start]<arr[end]) return bs(arr,target,start, end,0);
        else{
            while(start<=end){
                int mid = start +(end-start)/2;
                if(mid<end && arr[mid]>arr[mid+1]) return bs(arr,target,0, arr.length-1,mid);
                if(mid>start && arr[mid] < arr[mid-1]) return bs(arr,target,0, arr.length-1,mid-1);
                if(arr[mid]<= arr[start]) end = mid-1;
                else if(arr[mid]>=arr[end]) start = mid;
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
