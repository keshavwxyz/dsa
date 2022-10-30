package com.learn;

public class armstrongNo {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            if(arm(i)){System.out.println(i);}
        }
    }
    static boolean arm(int a){
        int rem,sum=0,temp=a;
        while(temp>0){
            rem = temp % 10;
            temp /= 10;
            rem *= rem * rem;
            sum += rem;
        }
        return (sum==a);
    }
}
