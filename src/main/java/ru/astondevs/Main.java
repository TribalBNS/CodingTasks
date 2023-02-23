package ru.astondevs;

import ru.astondevs.taskone.ArraysTask;
import ru.astondevs.taskone.Factorials;
import ru.astondevs.taskone.Fibonacci;
import ru.astondevs.taskone.Strings;
import ru.astondevs.tasktwo.Streams;

import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Factorials factorials = new Factorials();
        factorials.factorialCalculation();

        Fibonacci fibonacci = new Fibonacci();
        fibonacci.fibonacciCalculation();

        ArraysTask arrays = new ArraysTask();
        arrays.arrayReversing();

        Strings strings = new Strings();
        strings.stringSplitter();

        Streams streams = new Streams();
        List<Integer> arr = Arrays.asList(1, 4, -3, 7);
        System.out.println(streams.positiveCollection(arr));
        System.out.println(streams.positiveMyliplyingNegativeMinusingCollection(arr));

        List<String> surnames = Arrays.asList("Антонов", "Белов", "Петров", "Алексеев", "Егоров", "Семенов");
        List<String> surnamesStartingWithA = streams.surnamesStartingWithACollection(surnames);
        System.out.println(surnamesStartingWithA);
    }
}