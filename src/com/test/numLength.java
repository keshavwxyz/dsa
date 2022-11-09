package com.test;

public class numLength {
    public int numLengthl(int a) {
        int count = 0;
        while(a != 0) {
            a = a / 10;
            count = count + 1;
        }
        return count;
    }
}
