package com.vladislav.conversion;

import static com.vladislav.conversion.Constants.*;

public class Units {

    int units;
    int trioOrder;

    public Units(int units, int trioOrder) {
        this.units = units;
        this.trioOrder = trioOrder;
    }


    public int getUnits() {
        return units;
    }

    public String nameUnits() {
        StringBuilder result = new StringBuilder();
        result.append(variantsOfNumbers(trioOrder));
        return result.toString();
    }

    public String variantsOfNumbers(int trio) {
        GiveNameToPartOfNumber name = new GiveNameToPartOfNumber(trio, units);
        String result;
        switch (units) {
            case ONE_NUMBER -> {
                if (trio == 2) {
                    result = ONE_ANOTHER + name.giveName();
                } else {
                    result = ONE + name.giveName();
                }
            }
            case TWO_NUMBER -> {
                if (trio == 2) {
                    result = TWO_ANOTHER + name.giveName();
                } else {
                    result = TWO + name.giveName();
                }
            }
            case THREE_NUMBER -> {
                result = THREE + name.giveName();
            }
            case FOUR_NUMBER -> {
                result = FOUR + name.giveName();
            }
            case FIVE_NUMBER -> {
                result = FIVE + name.giveName();
            }
            case SIX_NUMBER -> {
                result = SIX + name.giveName();
            }
            case SEVEN_NUMBER -> {
                result = SEVEN + name.giveName();
            }
            case EIGHT_NUMBER -> {
                result = EIGHT + name.giveName();
            }
            case NINE_NUMBER -> {
                result = NINE + name.giveName();
            }
            default -> result = "";
        }
        return result;
    }
}
