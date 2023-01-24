package com.Algo.BinarySearch;

public class LeetSplitArrayLargestSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(sala(arr));
    }
    //without the binary search - bruteforce
    static int sala(int[] arr){
        int ans=sum(arr,0, arr.length-1),temp=0;
        for (int i = 0; i < arr.length-1; i++) {
            if(sum(arr,0,i)<sum(arr,i,arr.length-1))temp = sum(arr,i+1,arr.length-1);
            else temp = sum(arr,0,i);
            if (temp<ans){ans=temp;}
        }
        return ans;
    }
    static int sum(int[] arr,int start,int end){
        int ans=0;
        for (int i = start; i <= end; i++) {
            ans+=arr[i];
        }
        return ans;
    }
}
