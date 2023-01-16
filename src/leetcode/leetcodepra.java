package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcodepra {
    public static void main(String[] args) {
        int[] a= {1,3};
        int[] b= {2};
        List list = new ArrayList<>(Arrays.asList(a));
        list.addAll(Arrays.asList(b));
        Object[] c = list.toArray();
        System.out.println(Arrays.toString(c));
    }
}
