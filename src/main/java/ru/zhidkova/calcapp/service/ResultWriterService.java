package ru.zhidkova.calcapp.service;
import ru.zhidkova.calcapp.util.Calculator;
import static ru.zhidkova.calcapp.util.Calculator.*;

public class ResultWriterService {
    public static void showResult(){
        if (operationSymbol.contains("+")) {
            System.out.println("Сумма " + num1 + " и " + num2 +  " будет равна " + Calculator.sum() + ".");
        } else if (operationSymbol.contains("-")) {
            System.out.println("Разница " + num1 + " и " + num2 + " будет равна " + Calculator.subtract() + ".");
        } else if (operationSymbol.contains("*")) {
            System.out.println("При умножении " + num1 + " и " + num2 + " результат будет равен " + Calculator.multiply() + ".");
        }
        else
            System.out.println("Введён некорректный символ операции");
    }
}