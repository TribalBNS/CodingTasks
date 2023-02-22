package ru.astondevs;

import ru.astondevs.taskone.Arrays;
import ru.astondevs.taskone.Factorials;
import ru.astondevs.taskone.Fibonacci;
import ru.astondevs.taskone.Strings;

public class Main {
    public static void main(String[] args) {
        Factorials factorials = new Factorials();
        factorials.factorialCalculation();
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.fibonacciCalculation();
        Arrays arrays = new Arrays();
        arrays.arrayReversing();
        Strings strings = new Strings();
        strings.stringSplitter();
    }
}