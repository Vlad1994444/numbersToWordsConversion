package com.vladislav.conversion;

import java.util.ArrayList;

public class Main{

    private static final int ONE_THOUSAND = 1000;

    public static void main(String[] args) {
        int trioOrder = 0;
        int number = 500600400;
        int numberToConvert;
        ArrayList<String>parts = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();

        while(number%ONE_THOUSAND>=1){
            trioOrder++;
            numberToConvert = number%ONE_THOUSAND;
            number = number/1000;
            System.out.println();
            parts.add(new Conversion(numberToConvert, trioOrder).convert());
        }
        for(int i = parts.size()-1; i>=0; i--){
            stringBuilder.append(parts.get(i));
        }
        System.out.println(stringBuilder);
    }
}
