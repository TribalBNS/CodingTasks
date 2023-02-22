package ru.astondevs.taskone;

import java.util.Scanner;

public class Strings {

    public void stringSplitter() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string you want to split: ");
        String str = sc.nextLine();
        boolean keep = true;
        String splitter = null;
        while (keep) {
            System.out.print("Enter a splitter: ");
            splitter = sc.nextLine();
            if (str.contains(splitter))
                keep = false;
            else {
                System.out.println("Unsuitable splitter, try again");
            }
        }
        String[] phrase = str.split(splitter);
        sc.close();
        for (String s : phrase) {
            System.out.println(s);
        }
    }
}
