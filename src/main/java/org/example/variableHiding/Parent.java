package org.example.variableHiding;

public class Parent {

        int x = 10;
    }

    class Child extends Parent {
        int x = 5;  // Variable hiding

        void display() {
            System.out.println("Child class - x: " + x);
            //System.out.println("Parent class - x: " + super.x);  // Accessing parent class variable
        }
    }



