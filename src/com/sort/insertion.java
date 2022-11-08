package com.sort;

import java.util.Arrays;

public class insertion {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};

        insortde(a);
        System.out.println(Arrays.toString(a));
    }

    public static void  insort(int[] a) {
        int temp,i;
        for (int j = 1; j < a.length; j++) {
            temp = a[j];
            i=j-1;
            while(i>=0 && a[i]>temp){
                a[i+1]=a[i];
                i=i-1;
            }
            a[i+1]=temp;
        }
    }
    public static void insortde(int[] a){
        int temp, i;
        for (int j=0;j<a.length; j++){
            temp=a[j];
            i=j+1;
            while(i<a.length && a[i]>a[j]){
                a[i]=a[i+1];
                j++;
            }
            a[j]=temp;
        }
    }
}
