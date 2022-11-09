package com.test;

import java.util.Arrays;
import java.util.Scanner;

public class NumToNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(); 
        numLength nl = new numLength();
        int[] o = new int[nl.numLengthl(a)];
        int i = nl.numLengthl(a)-1;
        while(a>0){
            o[i]=a%10;
            a=a/10;
            i--;
        }
        System.out.println(Arrays.toString(o));
        int[] n = new int[7];
    }
}
