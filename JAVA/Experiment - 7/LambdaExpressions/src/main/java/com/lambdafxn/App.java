package com.lambdafxn;

@FunctionalInterface
interface Calculator {
    double calculate(double a, double b);
}

public class App {
    public static void main(String[] args) {
        Calculator addition = (a, b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;
        Calculator multiplication = (a, b) -> a * b;
        Calculator division = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Division by zero is not allowed");
            }
            return a / b;
        };

        double num1 = 10.0;
        double num2 = 5.0;

        System.out.println("Calculator using Lambda Expressions");
        System.out.println("Numbers: " + num1 + " and " + num2);
        System.out.println("Addition: " + addition.calculate(num1, num2));
        System.out.println("Subtraction: " + subtraction.calculate(num1, num2));
        System.out.println("Multiplication: " + multiplication.calculate(num1, num2));
        try {
            System.out.println("Division: " + division.calculate(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}