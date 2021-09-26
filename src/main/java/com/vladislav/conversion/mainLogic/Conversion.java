package com.vladislav.conversion.mainLogic;

import com.vladislav.conversion.nameTrios.Dozens;
import com.vladislav.conversion.nameTrios.Hundreds;
import com.vladislav.conversion.nameTrios.SpecialDozens;
import com.vladislav.conversion.nameTrios.Units;

public class Conversion{

    private static final int ONE_HUNDRED = 100;
    private static final int TEN = 10;


    int numberToConvert;
    int trioOrder;

    public Conversion(int numberToConvert, int count) {
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

    public String convert(){

        StringBuilder stringBuilder = new StringBuilder();

        int hundreds = numberToConvert/ONE_HUNDRED;          //get amount of hundreds
        int dozensAndUnits = numberToConvert%ONE_HUNDRED;   //get dozens and units
        int units = dozensAndUnits%TEN;                        //get just units
        int dozens = dozensAndUnits - units;                    //get just dozens

        stringBuilder.append(new Hundreds(dozensAndUnits,hundreds, trioOrder).nameHundreds()+" ");

        if(dozensAndUnits>=20){
            stringBuilder.append(new Dozens(units, dozens, trioOrder).nameDozens()+" ");
        }else if(dozensAndUnits>=10 & dozensAndUnits<20){
            stringBuilder.append(new SpecialDozens(dozensAndUnits, trioOrder).nameSpecialDozens()+" ");
        }else{
            stringBuilder.append(new Units(units, trioOrder).nameUnits()+" ");
        }

        return stringBuilder.toString();
    }
}
