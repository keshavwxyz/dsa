package com.arrays;

import java.util.LinkedList;
import java.util.List;

public class linkListReverse {
    public static void main(String[] args) {
        List<String> ls = new LinkedList<>();
        ls.add("asdas");
        ls.add("zxczxc");
        ls.add("xcvxcvx");
        ls.add("vbnvbnvn");
        ls.add("fhghghf");
        ls.add("rtyrtyr");
        System.out.println(reve(ls));
    }

    private static List<String> reve(List<String> ls) {
        for (int i = 0; i < ls.size()-1; i++) {
            String a,b;
            a = ls.get(i);
            b = ls.get(ls.size()-1-i);
            ls.set(i,b);
            ls.set(ls.size()-1-i,a);
        }
        return ls;
    }
}
