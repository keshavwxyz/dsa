package com.Algo.LinearSearch;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {2,3,4},
                {23,34,45,56},
                {234,345,456,567,678}
        };
        int target = 234;
        System.out.println(search(arr,target));
    }
    public static int search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++){
                if (target == arr[row][col])return target;
            }
        }
        return -1;
    }
}
