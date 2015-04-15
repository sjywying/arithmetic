package com.crazy.arithmetic.maxsubarr;

import java.util.Arrays;

/**
 *
 * 1. 暴力法
 *
 *
 * Created by crazyy on 15/4/15.
 */
public class Violence {

    public static void main(String[] args) {
        int[] array = {1, -2, 3, 10, -4, 7, -3, 8, 2, -5};

        int[] targetArr = parser(array);

        System.out.println(Arrays.toString(targetArr));
    }


    public static int[] parser(int[] sourceArr) {

        if(sourceArr == null || sourceArr.length == 0) return null;

        int sum = 0, i_= 0, j_ = 0;

        for (int i = 0; i < sourceArr.length; i++) {
            int ival = sourceArr[i];

            int sumtemp = 0;
            for (int j = i; j < sourceArr.length; j++) {
                int jval = sourceArr[j];

                sumtemp += sourceArr[j];

                if(sum < sumtemp) {
                    i_ = i;
                    j_ = j;
                    sum = sumtemp;
                }

            }

        }

        System.out.println(i_ + "--" + j_);

        int[] targetArr = new int[j_-i_+1];

        for (int i = i_; i <= j_; i++) {
            int value = sourceArr[i];
            targetArr[i-i_] = value;
        }

        return targetArr;
    }
}
