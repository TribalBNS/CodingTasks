package ru.astondevs.taskone;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Factorials {

    public void factorialCalculation() {
        Scanner sc = new Scanner(System.in);
        boolean keep = true;
        int number = 0;
        int method = 0;
        while (keep) {
            System.out.print("Enter the integer whose factorial you want to calculate: ");
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
        keep = true;
        while (keep) {
            System.out.print("Choose a number corresponding to the method you want to use:" +
                    "\n1 - non recursive\n2 - recursive\n3 - using stream\n");
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
        sc.close();
        if (number < 32) {
            switch (method) {
                case (1):
                    System.out.println("Factorial of " + number + " is " + getIntFactorial(number));
                    break;
                case (2):
                    System.out.println("Factorial of " + number + " is " + getIntFactorialUsingRecursiveMethod(number));
                    break;
                case (3):
                    System.out.println("Factorial of " + number + " is " + getIntFactorialUsingStream(number));
                    break;
            }
        } else {
            switch (method) {
                case (1):
                    System.out.println("Factorial of " + number + " is " + getBigFactorial(number));
                    break;
                case (2):
                    System.out.println("Factorial of " + number + " is " + getBigFactorialUsingRecursiveMethod(number));
                    break;
                case (3):
                    System.out.println("Factorial of " + number + " is " + getBigFactorialUsingStream(number));
                    break;
            }
        }
    }

    public int getIntFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }

    public int getIntFactorialUsingRecursiveMethod(int f) {
        if (f <= 1) {
            return 1;
        } else {
            return f * getIntFactorialUsingRecursiveMethod(f - 1);
        }
    }

    public int getIntFactorialUsingStream(int f) {
        if (f <= 1) {
            return 1;
        } else {
            return IntStream.rangeClosed(2, f).reduce((x, y) -> x * y).getAsInt();
        }
    }

    public BigInteger getBigFactorial(int f) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= f; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }

    public BigInteger getBigFactorialUsingRecursiveMethod(int f) {
        if (f <= 1) {
            return BigInteger.valueOf(1);
        } else {
            return BigInteger.valueOf(f).multiply(getBigFactorialUsingRecursiveMethod(f - 1));
        }
    }

    public BigInteger getBigFactorialUsingStream(int f) {
        if (f < 2) {
            return BigInteger.valueOf(1);
        } else {
            return IntStream.rangeClosed(2, f).mapToObj(BigInteger::valueOf).reduce(BigInteger::multiply).get();
        }
    }
}
