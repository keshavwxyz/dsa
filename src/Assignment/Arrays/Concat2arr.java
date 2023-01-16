package Assignment.Arrays;

import java.util.Arrays;

public class Concat2arr {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7};
        int[] arr2 = {9,8,7,6,5,4,3};
        System.out.println(Arrays.toString(concat(arr1,arr2)));
    }

    public static int[] concat(int[] arr1, int[] arr2) {
        int[] lol= new int[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            lol[i]=arr1[i];
        }
        for (int r = 0; r < arr2.length; r++) {
            lol[arr1.length+r]=arr2[r];
        }
        return lol;
    }
}
