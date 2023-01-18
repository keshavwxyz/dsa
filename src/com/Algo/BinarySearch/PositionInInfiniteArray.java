package com.Algo.BinarySearch;

public class PositionInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 19, 22, 25, 27, 29, 34, 37, 45, 49, 56, 57, 63, 69, 70, 71, 72, 73, 74, 75, 76, 77, 79, 81, 82, 83, 84};
        System.out.println(piia(arr,15));
    }
    static int piia(int[] arr, int target){
        int start = 0;
        int end = 1;
        int count = 1;
        boolean flag = true;
        while(flag){
            if(arr[start]<target&&arr[end]>target){
                while(start<=end){
                    int mid = start + (end-start)/2;
                    if(target < arr[mid])end=mid-1;
                    else if (target==arr[mid]) return arr[mid];
                    else if (target>arr[mid])start=mid+1;
                }
            }
            else{
                count++;
                start = end + 1;
                end = start + (count*count);
            }
        }
        return -1;
    }
}
