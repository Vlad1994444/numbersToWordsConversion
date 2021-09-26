package com.vladislav.conversion;

import com.vladislav.conversion.mainLogic.Convert;
import com.vladislav.conversion.stepsAfterConversion.WhatToDoNext;

import java.util.Scanner;

public class Main {

    public static  boolean doNext = true;

    public static void main(String[] args) {

        Convert convertNumber = new Convert();
        WhatToDoNext nextStep = new WhatToDoNext();
        Scanner scanner;

        System.out.println("Enter preferable number");
        do{
            scanner = new Scanner(System.in);
            if(scanner.hasNextInt()){
                System.out.println(convertNumber.convert(scanner.nextInt()));
                nextStep.whatToDoNext();
            }else{
                System.out.println("Restart program to give valid enter");
                doNext = false;
            }
        }while(doNext);
        scanner.close();
    }
}
