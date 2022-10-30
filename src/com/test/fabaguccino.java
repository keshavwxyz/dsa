package com.test;

public class fabaguccino {
    public static void main(String[] args) {
        long a=0,b=1,temp;
        long n = 100;
        System.out.println(a);
        System.out.println(b);
        for (int i = 3; i <n; i++) {
            if (i%5==0 && i!=0) {
                a=b;
                b=5;
                System.out.println(b);
            }
            else {
                temp = a + b;
                a = b;
                b = temp;
                System.out.println(b);
            }
        }
    }
}
