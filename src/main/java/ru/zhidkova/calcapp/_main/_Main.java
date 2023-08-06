package ru.zhidkova.calcapp._main;

import ru.zhidkova.calcapp.util.Calculator;

import java.util.Scanner;

public class _Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int num2 = scanner.nextInt();

        System.out.println("Сумма чисел будет равна " + Calculator.sum(num1, num2));
        System.out.println("Разница чисел будет равна " + Calculator.subtract(num1, num2));
        System.out.println("При умножении чисел результат будет равен " + Calculator.multiply(num1, num2));
    }
}