package org.example;


public class Tapsiriqlar {
    //2-ye bolunen ededleri tapmaq ucun method
    public static void tap1(int eded) {


        for (int i = 0; i < eded; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ededi 2 ye bolunur");

            }
        }


    }

    //ededin sade veya murekkeb olduqunu tapmaq ucun method
    public static void tap2(int value) {
        for (int i = 2; i < value; i++) {
            if (value % 1 == 0 && value % value == 0 && (value % i) != 0) {
                System.out.println(value + " ededi sadedir");
                break;

            } else if (value % 1 == 0 && value % value == 0 && value % i == 0) {
                System.out.println(value + " ededi murekkebdir");
                break;
            }

        }

    }

    //verilmis ededin reqemleri cemini tapmaq ucun method
    public static void tap3(int value) {
        int cem = 0;
        while (value > 0) {
            int qaliq = value % 10;
            value = value / 10;
            cem += qaliq;


        }
        System.out.println(cem);


    }

    //3-cu deyisenden istifade etmeden 2 deyisenin yerini deyismek
    public static void tap4() {
        int a = 5;
        int b = 6;
        b = b + a;
        a = b - a;
        b = b - a;

        System.out.println(a);
        System.out.println(b);
    }

    //ededin reqemlerinin sayini tapin
    public static void tap5(Integer value) {
        int i = 0;
        while (value > 0) {

            int qaliq = value % 10;
            value = value / 10;
            i++;

        }
        System.out.println(i);

    }

    //faktorial for ile
    public static void tap6(int value) {
        //5=5*4*3*2*1
        int b = 1;
        for (int i = 1; i <= value; i++) {

            b *= i;


        }
        System.out.println(b);
    }

    // factorial  for istifade etmeden
    public static Integer tap7(int value) {
        if (value == 0) {
            return 1;

        } else {
            return value * tap7(value - 1);
        }

    }
    //polindrom sozlerin tapilmasi

    public static void tap8(String value) {
        char arr[] = value.toCharArray();
        for (int i = 0; i <= arr.length / 2; i++) {


            if (arr[i] != arr[arr.length - i - 1]) {

                System.out.println("false");
            } else {
                System.out.println("true");
            }


        }
    }
    //metod value sayi qeder c-simvolunu b=tru olarsa alt alta,b=false olarsa yan yana cap edir
    public static void tap9(int value,char c,boolean b){
        for (int i = 0; i <value ; i++) {
            if (b==true){
            System.out.println(c);}
            else if (b==false){
                System.out.print(c);
            }

        }
//a dan b ye qeder buttun ededleri c qeder quvvete yukseltmek ucun method
    }public static void tap10(int a,int b,int c){
        for (int i = a; i <b ; i++) {
           double result=Math.pow(i,c);
            System.out.println(result);

        }
    }
    //worde characteri value qeder birlesdir
    public static void tap11(String word,int value,char character){
        for (int i = 0; i <value ; i++) {
            word+=character;
            System.out.println(word);

        }

    }
    //a ve b indexleri arasindaki characterleri getirmek ucun method
    public static void tap12(int a,int b,String word){
      String s=  word.substring(a,b);
        System.out.println(s);

    }
    //cumlenin ve ya sozun evvelindeki ve sonundaki bosluqlari silmek ucun method
    public static void tap13(String word){
       String s= word.trim();
        System.out.println(s);

    }
    //massivdeki ededleri toplayir ve geriye qaytarir. Meselen: {1,2,3,4,5} method return edecek 1+2+3+4+5;
    public static void tap14(Integer [] args){
        int cem=0;
        for (Integer arr:args) {
          cem+=arr.intValue();

        }
        System.out.println(cem);

    }
    public static boolean tap15(Integer []args) {
        for (int i = 0; i <args.length-1 ; i++) {
            if (args[i]==args[i+1]){
                return true;
            }
        }return false;

        }
        public static boolean taps16(Integer []args){
            for (int i = 1; i <args.length ; i++) {
                if (args[i]<=args[i-1]){
                    return false;
                }

            }return true;
        }

}
