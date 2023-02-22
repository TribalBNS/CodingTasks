package ru.astondevs.taskone;

import java.util.Scanner;
import java.util.stream.Stream;

public class Fibonacci {

    public void fibonacciCalculation() {
        Scanner sc = new Scanner(System.in);
        boolean keep = true;
        int number = 0;
        int method = 0;
        while (keep) {
            System.out.print("Fibonacci numbers.\n" +
                    "Choose a number corresponding to the operation you want to perform:" +
                    "\n1 - row of Fibonacci numbers\n2 - sum of Fibonacci numbers\n3 - Nth Fibbonacci number\n");
            String methodInput = sc.nextLine();
            try {
                method = Integer.parseInt(methodInput);
                if (method < 1 || method > 3) {
                    System.out.println("Only three options available, try again");
                    continue;
                }
            } catch (NumberFormatException exception) {
                System.out.println("Not a number, try again");
                continue;
            }
            keep = false;
        }
        keep = true;
        while (keep) {
            System.out.print("Enter the integer to operate with: ");
            String numberInput = sc.nextLine();
            try {
                number = Integer.parseInt(numberInput);
                if (number < 0) {
                    System.out.println("Only positive integers are suitable, try again");
                    continue;
                }
            } catch (NumberFormatException exception) {
                System.out.println("Not an integer, try again");
                continue;
            }
            keep = false;
        }
        sc.close();
            switch (method) {
                case (1):
                    rowOfNumbers(number);
                    break;
                case (2):
                    sumOfNumbers(number);
                    break;
                case (3):
                    System.out.println(nthNumber(number));
                    break;
            }
    }

    public void rowOfNumbers(int total) {
        long[] arr = new long[total];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        for (long j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public void sumOfNumbers(int total) {
        long result = Stream.iterate(new long[]{0, 1}, arr -> new long[]{arr[1], arr[0] + arr[1]})
                .limit(total)
                .map(t -> t[0])
                .mapToLong(Long::longValue)
                .sum();
        System.out.println(result);
    }

    public long nthNumber(int number) {
        if (number <= 1) {
            return 0;
        } else if (number == 2) {
            return 1;
        } else {
            return nthNumber(number - 1) + nthNumber(number - 2);
        }
    }

}
