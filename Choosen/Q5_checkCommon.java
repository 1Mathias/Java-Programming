package Choosen;

import java.util.Arrays;

public class Q5_checkCommon {
    public static void main(String[] args) {
        Object o = null;
        int[] result=checkCommon(new int[]{1, 8, 3, 2}, new int[] {});

        for (int t = 0; t < result.length; t++){
            System.out.println(result[t]);
        }
    }
    static int[] checkCommon(int[] first, int[] second) {
        if (first == null || second == null) return null;
        if (first.length == 0 || second.length == 0) return new int[0];
        int min =
                (first.length < second.length) ? first.length : second.length;
        int[] a, b;
        if (min == first.length) {
            a = first;
            b = second;
        } else {
            a = second;
            b = first;
        }
        int[] c = new int[min];
        int k = 0;
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < b.length; j++)
                if (a[i] == b[j]) {
                    c[k] = a[i];
                    k++;
                }
        int[] retArray = new int[k];
        for (int t = 0; t < retArray.length; t++){
            retArray[t] = c[t];
        }
        return retArray;
    }
}
