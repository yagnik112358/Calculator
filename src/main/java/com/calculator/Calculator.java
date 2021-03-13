package com.calculator;

import java.util.Scanner;

public class Calculator implements Operations{
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println("Select options");
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        System.out.println("Kam thy gyu");
    }
    @Override
    public double sqrt(double number) {
        return Math.sqrt(number);
    }

    @Override
    public long factorial(int number) {
        return 0;
    }

    @Override
    public double log(double number) {
        return Math.log(number);
    }

    @Override
    public double power(double number, double exponent) {
        return Math.pow(number,exponent);
    }
}
