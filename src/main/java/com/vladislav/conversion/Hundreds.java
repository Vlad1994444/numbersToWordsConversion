package com.vladislav.conversion;

public class Hundreds{

    public static final String ONE_HUNDRED = "сто";
    public static final String TWO_HUNDRED = "двесте";
    public static final String THREE_HUNDRED = "триста";
    public static final String FOUR_HUNDRED = "четыреста";
    public static final String FIVE_HUNDRED = "пятьсот";
    public static final String SIX_HUNDRED = "шестьсот";
    public static final String SEVEN_HUNDRED = "семьсот";
    public static final String EIGHT_HUNDRED = "восемьсот";
    public static final String NINE_HUNDRED = "девятьсот";

    int hundreds;
    int count;

    public Hundreds(int hundreds) {
        this.hundreds = hundreds;
    }

    public int getHundreds() {
        return hundreds;
    }

    public String nameHundreds() {

        String result = switch (hundreds) {
            case 1 -> ONE_HUNDRED;
            case 2 -> TWO_HUNDRED;
            case 3 -> THREE_HUNDRED;
            case 4 -> FOUR_HUNDRED;
            case 5 -> FIVE_HUNDRED;
            case 6 -> SIX_HUNDRED;
            case 7 -> SEVEN_HUNDRED;
            case 8 -> EIGHT_HUNDRED;
            case 9 -> NINE_HUNDRED;
            default -> "";
        };
        return result;
    }
}
