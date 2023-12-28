package org.example;

import java.util.Scanner;

public class Tapsiriqlar {
    public static void tap1(int eded
    ){


        for (int i = 0; i < eded; i++) {
            if (i%2==0){
                System.out.println(i+" ededi 2 ye bolunur");

            }
        }


    }
    public static void tap2(int value){
        for (int i = 2; i <value ; i++) {
            if (value%1==0 && value%value==0 && (value%i)!=0){
                System.out.println(value+" ededi sadedir");
                break;

            }else if (value%1==0 && value%value==0 && value%i==0){
                System.out.println(value+" ededi murekkebdir");
                break;
            }

        }

    }

}
