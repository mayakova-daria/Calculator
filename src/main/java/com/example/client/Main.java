package com.example.client;

import com.example.calculator.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int a = 10;
        int b = 5;

        System.out.println("Addition: " + calculator.add(a, b));
        System.out.println("Subtraction: " + calculator.subtract(a, b));
        System.out.println("Multiplication: " + calculator.multiply(a, b));
        try {
            System.out.println("Division: " + calculator.divide(a, b));
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }
    }
}
