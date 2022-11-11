package com.Algo;
//import javafx.util.Pair;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,32,43,5423,23,43,5,42,324,234,245,34};
        System.out.println(LS(arr,54));
    }
    static String LS(int[] a,int b){
        for (int i = 0; i < a.length; i++) {
            if(a[i]==b)return "the number "+b+" exist in this array";
        }
        return "it doesn't";
    }
}
