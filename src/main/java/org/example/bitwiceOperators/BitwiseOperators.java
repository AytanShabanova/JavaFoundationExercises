package org.example.bitwiceOperators;

public class BitwiseOperators {
    public static void main(String[] args) {
        int a=1;
        if (a>2 ||a++ >5){
            System.out.println("in if a"+a);

        }
        System.out.println("outside of if"+a);
        System.out.println("----------------------------------------------------------------------------------------");
        int b=1;
        if (b>2 | b++ >5){
            System.out.println("in if a"+b);

        }
        System.out.println("outside of if"+b);
        System.out.println("----------------------------------------------------------------------------------------");
        int c=1;
        if (c>2 && c++ >5){
            System.out.println("in if a"+c);

        }
        System.out.println("outside of if"+c);
        System.out.println("-----------------------------------------------------------------------------------------");
        int d=1;
        if (d>2 & d ++ >5){
            System.out.println("in if a"+d);

        }
        System.out.println("outside of if"+d);


    }
}
