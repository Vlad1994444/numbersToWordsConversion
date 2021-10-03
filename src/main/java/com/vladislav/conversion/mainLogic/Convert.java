package com.vladislav.conversion.mainLogic;

import java.math.BigInteger;
import java.util.ArrayList;

public class Convert {

    private static final BigInteger ONE_THOUSAND = BigInteger.valueOf(1000);
    private static final BigInteger ONE = BigInteger.valueOf(1);

    public Convert() {
    }

    public String convert(BigInteger number) {

        int trioOrder = 0;
        BigInteger numberToConvert;
        ArrayList<String> parts = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();

        while (number.compareTo(ONE) >= 0) {
            trioOrder++;
            numberToConvert = number.mod(ONE_THOUSAND);
            number = number.divide(ONE_THOUSAND);
            parts.add(new Conversion(numberToConvert.longValue(), trioOrder).convert());
        }
        if (parts.size() == 1) {
            stringBuilder.append(parts.get(0).trim());
        } else {

            for (int i = parts.size() - 1; i >= 1; i--) {
                if (!parts.get(i).isBlank()) {
                    stringBuilder.append(parts.get(i).strip()+" ");
                }
            }
            stringBuilder.append(parts.get(0).strip());
        }
        return stringBuilder.toString().strip();
    }
}
