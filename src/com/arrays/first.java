package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        int[] rollno = new int[10];
        String[] name = new String[10];
        //System.out.println(name[0]);
        int[][] dara = new int[3][3];
        Scanner in = new Scanner(System.in);

        for (int row = 0; row < dara.length; row++) {
            for (int col = 0; col < dara[row].length; col++) {
                dara[row][col] = in.nextInt();
            }
        }
        // output
        for (int row = 0; row < dara.length; row++) {
            for (int col = 0; col < dara[row].length; col++) {
                System.out.print(dara[row][col]+"  ");
            }
            System.out.println("\n");
        }

        for (int[] ints : dara) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
