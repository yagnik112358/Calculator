package com.calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator implements Operations{
    public static Logger logger = LogManager.getLogger(Calculator.class);
    @Override
    public double sqrt(double number) {
        logger.info("[SQUAREROOT]-"+number);
        double answer=Math.sqrt(number);//implement karje bhai
        logger.info("[SQUAREROOT ANSWER]-"+answer);
        return answer;
    }
    @Override
    public double factorial(int number) {
        logger.info("[FACTORIAL]-"+number);
        double answer=1;
        for(double i = 1;i<=number;i++) answer = answer*i;
        logger.info("[FACTORIAL ANSWER]-"+answer);
        return answer;
    }

    @Override
    public double log(double number) {
        logger.info("[log]-"+number);
        double answer=Math.log(number);//implement karje bhai
        logger.info("[log ANSWER]-"+answer);
        return answer;
    }

    @Override
    public double power(double number, double exponent) {
        logger.info("[POWER]-"+number);
        double answer=Math.pow(number,exponent);//implement karje bhai
        logger.info("[POWER ANSWER]-"+answer);
        return answer;
    }
}
