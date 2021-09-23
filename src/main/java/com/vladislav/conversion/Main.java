package com.vladislav.conversion;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Convert convertNumber = new Convert();
        System.out.println("Enter preferable number");
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()){
            convertNumber.convert(scanner.nextInt());
        }else {
            System.out.println("Restart program to give valid enter");
        }
        scanner.close();
    }
}
