package com.Algo.BinarySearch;

public class NoOfRotations {
    public static void main(String[] args) {
        int[] arr = {8,9,12,15,17,19,20,26,37,39,40,52,62,74,85,96,1,2,3,4,5,6,7};
        System.out.println("No of Rotation: " + (pivot(arr)+1));
    }
    static int pivot(int[] arr){
        if(arr[0]<arr[arr.length-1]) return 0;
        else{
            int start = 0,end=arr.length-1;
            while(start<=end){
                int mid = start +(end-start)/2;
                if(mid<end && arr[mid]>arr[mid+1]) return mid;
                if(mid>start && arr[mid] < arr[mid-1]) return mid-1;
                if(arr[mid]<= arr[start]) end = mid-1;
                else if(arr[mid]>=arr[end]) start = mid;
            }
        }
        return -1;
    }
}

