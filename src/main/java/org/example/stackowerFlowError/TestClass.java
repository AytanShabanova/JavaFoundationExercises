package org.example.stackowerFlowError;

public class TestClass {
    public static void main(String[] args) {

        testA();
    }
    public static void testA(){

        testB();

    }

    public static void testB(){

        testA();
    }
}
