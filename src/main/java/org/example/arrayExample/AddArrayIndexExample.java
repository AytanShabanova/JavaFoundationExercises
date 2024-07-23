package org.example.arrayExample;

import java.util.Arrays;

public class AddArrayIndexExample {
    public static void test2(int num) {
        int[] firstArr = new int[4];
        firstArr[0] = 4;
        firstArr[1] = 2;
        firstArr[2] = 5;
        firstArr[3] = 1;

        int element = 5;
        int[] secArr = new int[element];

        for (int i = 0; i < firstArr.length; i++) {
            secArr[i] = firstArr[i];

        }

        secArr[element - 1] = num;


        System.out.println(Arrays.toString(secArr));
    }


}
