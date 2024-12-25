package com.sony;

public class Main {
    public static void main(String[] args) {
       calculator cal = new calculator();
       System.out.println("Addition"+ cal.add(4,5));
        System.out.println("Subtraction"+ cal.sub(10,5));
        System.out.println("Multiplication"+ cal.mul(10,5));
    }
}
