package ru.zhidkova.calcapp.service;
import ru.zhidkova.calcapp.util.Calculator;

import java.util.Scanner;

public class ResultWriterService {
    public static void showResult(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число:");
        int num2 = scanner.nextInt();
        System.out.println("Введите символ операции (+, -, *):");
        String operationSymbol = scanner.next();

        int sumResult = Calculator.sum(num1, num2);
        int subtractResult = Calculator.subtract(num1, num2);
        int multiplyResult = Calculator.multiply(num1, num2);

        if (operationSymbol.contains("+")) {
            System.out.println("Сумма " + num1 + " и " + num2 +  " будет равна " + sumResult + ".");
        } else if (operationSymbol.contains("-")) {
            System.out.println("Разница " + num1 + " и " + num2 + " будет равна " + subtractResult + ".");
        } else if (operationSymbol.contains("*")) {
            System.out.println("При умножении " + num1 + " и " + num2 + " результат будет равен " + multiplyResult + ".");
        }
        else
            System.out.println("Введён некорректный символ операции");
    }
}