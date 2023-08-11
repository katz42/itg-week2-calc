package ru.zhidkova.calcapp.util;

public class Calculator {
    public static int num1;
    public static int num2;
    public static String operationSymbol;

    public static int sum() {
        int sumResult = num1 + num2;
        return sumResult;
    }

    public static int subtract() {
        int subtractResult = num1 - num2;
        return subtractResult;
    }

    public static int multiply() {
        int multiplyResult = num1 * num2;
        return multiplyResult;
    }
}
