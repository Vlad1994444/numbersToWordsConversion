package com.vladislav.conversion;

import java.util.ArrayList;
import java.util.Scanner;

public class Convert {

    private static final int ONE_THOUSAND = 1000;

    public Convert() {
    }

    public void convert(int number) {
        int trioOrder = 0;
        int numberToConvert;
        ArrayList<String> parts = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();

        while (number % ONE_THOUSAND >= 1) {
            trioOrder++;
            numberToConvert = number % ONE_THOUSAND;
            number = number / 1000;
            parts.add(new Conversion(numberToConvert, trioOrder).convert());
        }
        for (int i = parts.size() - 1; i >= 0; i--) {
            stringBuilder.append(parts.get(i));
        }
        System.out.println(stringBuilder);
        whatToDoNext();
    }

    public void whatToDoNext() {
        Scanner scanner;
        do {
            System.out.println("Please press 'Y' if you want continue and 'N' if you do not");
            scanner = new Scanner(System.in);
        } while (!(scanner.hasNext("Y") || scanner.hasNext("N")));

        if (scanner.hasNext("Y")) {
            System.out.println("Enter number which you want");
            scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                convert(scanner.nextInt());
            } else {
                System.out.println("Yours enter is incorrect. Try again");
                whatToDoNext();
            }
        } else {
            System.out.println("Goodbye");
            scanner.close();

        }
    }
}
