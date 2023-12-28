package org.example;

import java.util.Scanner;

public class Tapsiriqlar {
    //2-ye bolunen ededleri tapmaq ucun method
    public static void tap1(int eded){


        for (int i = 0; i < eded; i++) {
            if (i%2==0){
                System.out.println(i+" ededi 2 ye bolunur");

            }
        }


    }
    //ededin sade veya murekkeb olduqunu tapmaq ucun method
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
    //verilmis ededin reqemleri cemini tapmaq ucun method
    public static void tap3(int value){
        int cem=0;
        while (value>0){
                int qaliq = value % 10;
            value=  value/10;
                cem+=qaliq;


        }System.out.println(cem);


    }

}
