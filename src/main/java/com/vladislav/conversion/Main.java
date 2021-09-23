package com.vladislav.conversion;

import java.util.ArrayList;

public class Main{

    private static final int ONE_THOUSAND = 1000;

    public static void main(String[] args) {
        int count = 0;
        int number = 1_033_123;
        int numberToConvert;
        ArrayList<String>parts = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();

        while(number%ONE_THOUSAND>=1){
            count++;
            numberToConvert = number%ONE_THOUSAND;
            number = number/1000;
            System.out.println();
            parts.add(new Conversion(numberToConvert, count).convert());
        }
        for(int i = parts.size()-1; i>=0; i--){
            stringBuilder.append(parts.get(i));
        }
        System.out.println(stringBuilder);
    }
}
