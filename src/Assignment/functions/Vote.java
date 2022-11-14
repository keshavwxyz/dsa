package Assignment.functions;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(vo(a));
    }
    static String vo(int a){
        String temp = "Not able to vote";
        if(a>=18) temp = "You are able to vote";
        return temp;
    }
}
