package com.vladislav.conversion;

public class Conversion extends Constants{

    private static final int ONE_HUNDRED = 100;
    private static final int TEN = 10;


    int numberToConvert;
    int count;

    public Conversion(int numberToConvert, int count) {
        this.numberToConvert = numberToConvert;
        this.count = count;
    }

    public int getNumberToConvert() {
        return numberToConvert;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Conversion{" +
                "numberToConvert=" + numberToConvert +
                ", count=" + count +
                '}';
    }

    public String convert(){


        StringBuilder stringBuilder = new StringBuilder();

        GiveNameToPartOfNumber name = new GiveNameToPartOfNumber(count);

        int hundreds = numberToConvert/ONE_HUNDRED;
        int dozensAndUnits = numberToConvert%ONE_HUNDRED;
        int units = dozensAndUnits%TEN;
        int dozens = dozensAndUnits - units;

//        if(hundreds!=0){
//            stringBuilder.append(new Hundreds(hundreds).nameHundreds());
//        }
        stringBuilder.append(new Hundreds(hundreds).nameHundreds());

        if(dozensAndUnits>=20){
            stringBuilder.append(new Dozens(units, dozens, count).nameDozens());
            if(units!=0){
                stringBuilder.append(new Units(units, count).nameUnits());
            }
        }else if(dozensAndUnits>=10 & dozensAndUnits<20){
            stringBuilder.append(new SpecialDozens(dozensAndUnits, count).nameSpecialDozens());
        }else{
            stringBuilder.append(new Units(units, count).nameUnits());
        }
        return stringBuilder.toString();
    }
}
