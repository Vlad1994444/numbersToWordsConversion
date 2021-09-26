package com.vladislav.conversion.nameTrios;

public class GiveNameToPartOfNumber {

    public static final String THOUSAND = "тысяча";
    public static final String THOUSAND_ANOTHER = "тысяч";
    public static final String THOUSAND_ANOTHER_ANOTHER = "тысячи";

    public static final String MILLION = "миллион";
    public static final String MILLION_ANOTHER = "миллиона";
    public static final String MILLION_ANOTHER_ANOTHER = "миллионов";

    public static final String BILLION = "миллиард";
    public static final String BILLION_ANOTHER = "миллиарда";
    public static final String BILLION_ANOTHER_ANOTHER = "миллиардов";

    public static final String TRILLION = "триллион";
    public static final String TRILLION_ANOTHER = "триллиона";
    public static final String TRILLION_ANOTHER_ANOTHER = "триллионов";

    int trioOrder;
    int units;

    public GiveNameToPartOfNumber(int trioOrder, int units) {
        this.trioOrder = trioOrder;
        this.units = units;
    }

    public String giveName() {
        String result = " ";
        switch (trioOrder) {
            /*
            problem. I can not write "null" because it is visible in output
             */
            case 1 -> result = "";
            case 2 -> {
                if (units == 1) {
                    result += THOUSAND;
                } else if (units >= 5 & units <= 20 | units % 10 == 0) {
                    result += THOUSAND_ANOTHER;
                } else {
                    result += THOUSAND_ANOTHER_ANOTHER;
                }
            }
            case 3 -> result += chooseTheEnding(MILLION, MILLION_ANOTHER, MILLION_ANOTHER_ANOTHER, units);
            case 4 -> result += chooseTheEnding(BILLION, BILLION_ANOTHER, BILLION_ANOTHER_ANOTHER, units);
            case 5 -> result += chooseTheEnding(TRILLION, TRILLION_ANOTHER, TRILLION_ANOTHER_ANOTHER, units);
            default -> result = "";
        }
        return result;
    }

    public String chooseTheEnding(String forOne, String forTwoTillFour, String others, int units) {
        if (units == 1) {
            return forOne;
        } else if (units >= 2 & units <= 4) {
            return forTwoTillFour;
        } else {
            return others;
        }
    }
}
