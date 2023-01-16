package com.Algo.LinearSearch;

public class richestPerson {
    public static void main(String[] args) {
        int[][] arr ={{1,3},{5,3},{6,4}};
        System.out.println(rich(arr));
    }

    private static int rich(int[][] arr) {
        int tempold = 0;
        for (int[] ints : arr) {
            int tempnew = 0;
            for (int anInt : ints) {
                tempnew += anInt;
            }
            if (tempnew > tempold) {
                tempold = tempnew;
            }
        }
        return tempold;
    }
}
