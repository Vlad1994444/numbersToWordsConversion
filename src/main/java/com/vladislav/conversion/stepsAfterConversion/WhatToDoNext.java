package com.vladislav.conversion.stepsAfterConversion;

import java.util.Scanner;

public class WhatToDoNext {

    public WhatToDoNext() {
    }

    public void whatToDoNext() {

        Scanner scanner;
        do {
            System.out.println("Please press 'Y' if you want continue and 'N' if you do not");
            scanner = new Scanner(System.in);
        } while (!(scanner.hasNext("Y") || scanner.hasNext("N")));

        if (scanner.hasNext("Y")) {
            System.out.println("Enter number which you want");
        } else {
            System.out.println("Goodbye");
            scanner.close();
            System.exit(0);
        }
    }
}
