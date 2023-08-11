package ru.zhidkova.calcapp._main;
import ru.zhidkova.calcapp.service.ResultWriterService;
import ru.zhidkova.calcapp.util.Calculator;

import java.util.Scanner;

import static ru.zhidkova.calcapp.util.Calculator.*;

public class _Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите первое число:");
            num1 = scanner.nextInt();
            System.out.println("Введите второе число:");
            num2 = scanner.nextInt();
            System.out.println("Введите символ операции (+, -, *):");
            operationSymbol = scanner.next();
            int sumResult = Calculator.sum();
            int subtractResult = Calculator.subtract();
            int multiplyResult = Calculator.multiply();
            ResultWriterService.showResult();
    }
}