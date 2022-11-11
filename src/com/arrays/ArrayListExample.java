package com.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(123);
        list.add(123);
        list.add(234);
        list.add(345);

        System.out.println(list);
        /*
        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        for (int i = 0; i <5; i++) {
            System.out.println(list.get(i));
        }
        */

        //multi array list
        ArrayList<ArrayList<Integer>> ml = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
             ml.add(new ArrayList<>());
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ml.get(i).add(in.nextInt());
            }
        }
        System.out.println(ml);
    }
}
