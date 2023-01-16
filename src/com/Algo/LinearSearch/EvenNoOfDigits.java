package com.Algo.LinearSearch;

public class EvenNoOfDigits {
    public static void main(String[] args) {
        int[] arr = {23,0,345,2,6,7896};
        System.out.println(ENOD(arr));
    }
    //for no of digits optimised
    public static int digits(int num){
        if (num<0) num = num * -1;
        return (int)(Math.log10(num))+1;
    }
    public static int ENOD(int[] arr){
        int count=0;
        for(int element : arr){
            if(even(element)) count++;
        }
        return count;
    }
    public static boolean even(int num){
        int c = 0;
        if (num<0) num = num * -1;
        if(num==0) c=1;
        while(num>0){
            c++;
            num = num/10;
        }
        return c%2==0;
    }
}
