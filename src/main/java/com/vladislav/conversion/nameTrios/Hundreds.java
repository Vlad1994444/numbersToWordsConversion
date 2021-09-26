package com.vladislav.conversion.nameTrios;

import static com.vladislav.conversion.constants.Constants.*;

public class Hundreds {

    int dozensAndUnits;
    int hundreds;
    int trioOrder;

    public Hundreds(int hundreds) {
        this.hundreds = hundreds;
    }

    public Hundreds(int dozensAndUnits, int hundreds, int trioOrder) {
        this.dozensAndUnits = dozensAndUnits;
        this.hundreds = hundreds;
        this.trioOrder = trioOrder;
    }

    public int getHundreds() {
        return hundreds;
    }

    public String nameHundreds() {

        GiveNameToPartOfNumber name = new GiveNameToPartOfNumber(trioOrder, dozensAndUnits);

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
        if (dozensAndUnits == 0) {
            return result + name.giveName();
        } else {
            return result;
        }
    }
}
