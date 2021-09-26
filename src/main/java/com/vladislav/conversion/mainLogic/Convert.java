package com.vladislav.conversion.mainLogic;

import java.util.ArrayList;

public class Convert {

    private static final int ONE_THOUSAND = 1000;

    public Convert() {
    }

    public String convert(long number) {

        int trioOrder = 0;
        long numberToConvert;
        ArrayList<String> parts = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();

        while (number % ONE_THOUSAND >= 1) {
            trioOrder++;
            numberToConvert = number % ONE_THOUSAND;
            number = number / 1000;
            parts.add(new Conversion(numberToConvert, trioOrder).convert());
        }

        stringBuilder.append(parts.get(parts.size()-1).stripLeading());//deleting spaces before first part
        for (int i = parts.size() - 2; i >= 1; i--) {
            stringBuilder.append(parts.get(i));
        }
        stringBuilder.append(parts.get(0).stripTrailing());//deleting spaces after last part
        return stringBuilder.toString();
    }
}
