package com.vladislav.conversion;

import org.apache.poi.xwpf.usermodel.BreakType;

import java.util.HashMap;

public class Units{

    public static final String ONE = "один";
    public static final String ONE_ANOTHER = "одна";
    private static final int ONE_NUMBER = 1;
    public static final String TWO = "два";
    private static final int TWO_NUMBER = 2;
    public static final String TWO_ANOTHER = "две";
    public static final String THREE = "три";
    private static final int THREE_NUMBER = 3;
    public static final String FOUR = "четыре";
    private static final int FOUR_NUMBER = 4;
    public static final String FIVE = "пять";
    public static final int FIVE_NUMBER = 5;
    public static final String SIX = "шесть";
    public static final int SIX_NUMBER = 6;
    public static final String SEVEN = "семь";
    public static final int SEVEN_NUMBER = 7;
    public static final String EIGHT = "восемь";
    public static final int EIGHT_NUMBER = 8;
    public static final String NINE = "девять";
    public static final int NINE_NUMBER = 9;



    int units;
    int count;

    public Units(int units, int count) {
        this.units = units;
        this.count = count;
    }


    public int getUnits() {
        return units;
    }

    public String nameUnits() {
        StringBuilder result = new StringBuilder();
        result.append(variantsOfNumbers(count));
        return result.toString();
    }

    public String variantsOfNumbers(int numberOfThousand) {
        GiveNameToPartOfNumber name = new GiveNameToPartOfNumber(count, units);
        String result = null;
        switch (units) {
            case ONE_NUMBER -> {
                if (numberOfThousand == 2) {
                    result = ONE_ANOTHER + name.giveName();
                } else {
                    result = ONE + name.giveName();
                }
            }
            case TWO_NUMBER ->{
                if (numberOfThousand == 2) {
                    result = TWO_ANOTHER + name.giveName();
                } else {
                    result = TWO + name.giveName();
                }
            }
            case THREE_NUMBER->{
                    result = THREE + name.giveName();
            }

        }
        return result;
    }
}
