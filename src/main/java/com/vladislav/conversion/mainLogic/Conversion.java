package com.vladislav.conversion.mainLogic;

import com.vladislav.conversion.nameTrios.Dozens;
import com.vladislav.conversion.nameTrios.Hundreds;
import com.vladislav.conversion.nameTrios.SpecialDozens;
import com.vladislav.conversion.nameTrios.Units;

public class Conversion {

    private static final int ONE_HUNDRED = 100;
    private static final int TEN = 10;


    long numberToConvert;
    int trioOrder;

    public Conversion(long numberToConvert, int count) {
        this.numberToConvert = numberToConvert;
        this.trioOrder = count;
    }

    @Override
    public String toString() {
        return "Conversion{" +
                "numberToConvert=" + numberToConvert +
                ", count=" + trioOrder +
                '}';
    }

    public String convert() {

        StringBuilder stringBuilder = new StringBuilder();

        int hundreds = (int) numberToConvert / ONE_HUNDRED;          //get amount of hundreds
        int dozensAndUnits = (int) numberToConvert % ONE_HUNDRED;   //get dozens and units
        int units = dozensAndUnits % TEN;                        //get just units
        int dozens = dozensAndUnits - units;                    //get just dozens

        stringBuilder.append(new Hundreds(dozensAndUnits, hundreds, trioOrder).nameHundreds() + " ");

        if (dozensAndUnits >= 20) {
            stringBuilder.append(new Dozens(units, dozens, trioOrder).nameDozens() + " ");
        } else if (dozensAndUnits >= 10 & dozensAndUnits < 20) {
            stringBuilder.append(new SpecialDozens(dozensAndUnits, trioOrder).nameSpecialDozens() + " ");
        } else if (units >= 1 & units <= 9) {
            stringBuilder.append(new Units(units, trioOrder).nameUnits() + " ");
        } else {
        }

        return stringBuilder.toString();
    }
}
