package ru.astondevs.taskone;

import java.util.Scanner;

public class Arrays {

    public void arrayReversing() {
        Scanner sc = new Scanner(System.in);
        boolean keep = true;
        double[] arr = new double[0];
        while (keep) {
            try {
                System.out.println("Enter an array of numbers, split with space: ");
                String array = sc.nextLine();
                String[] string = array.split(" ");
                arr = new double[string.length];
                for (int i = 0; i < string.length; i++) {
                    arr[i] = Double.parseDouble(string[i]);
                }
            } catch (NumberFormatException exception) {
                System.out.println("Wrong input");
                continue;
            }
            keep = false;
        }
        sc.close();
        double[] revArr = new double[arr.length];
        for (int i = 0; i < revArr.length; i++) {
            revArr[revArr.length - i - 1] = arr[i];
        }
        System.out.println(java.util.Arrays.toString(revArr));
    }

}
