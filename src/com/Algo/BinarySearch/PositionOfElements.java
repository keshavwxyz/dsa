package com.Algo.BinarySearch;

import java.util.Arrays;

public class PositionOfElements {
    public static void main(String[] args) {
        int[] arr = {1,2,4,4,5,5,5,6,7,7,8,8,8,8,9,10};
        System.out.println(Arrays.toString(poe(arr, 8)));
    }
    public static int[] poe(int[] arr, int target){
        int[] ans = {-1,-1};
        ans[0]=search(arr,target,true);
        ans[1]=search(arr,target,false);
        return ans;
    }
    static int search(int[] arr, int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target < arr[mid])end=mid-1;
            else if (target>arr[mid])start=mid+1;
            else if (target==arr[mid]){
                ans=mid;
                if(findStartIndex)end=mid-1;
                else start=mid+1;
            }
        }
        return ans;
    }
}
