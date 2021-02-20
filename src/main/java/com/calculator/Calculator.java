package com.calculator;

public class Calculator implements Operations{
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
