package com.vladislav.conversion;

import java.util.HashMap;

import static com.vladislav.conversion.Constants.*;

public class Dozens{

    int units;
    int dozens;
    int trioOrder;

    HashMap<Integer,String > allDozens = new HashMap<>();

    public Dozens(int dozens) {
        this.dozens = dozens;
    }

    public Dozens(int units, int dozens, int trioOrder) {
        this.units = units;
        this.dozens = dozens;
        this.trioOrder = trioOrder;
    }

    public Dozens(int dozens, int trioOrder) {
        this.dozens = dozens;
        this.trioOrder = trioOrder;
    }

    public String nameDozens(){

        GiveNameToPartOfNumber name = new GiveNameToPartOfNumber(trioOrder, dozens);
        String result;
        putValuesInMap(allDozens);
        if(units==0){
            result = allDozens.get(dozens)+name.giveName();
        } else{
            result = allDozens.get(dozens) + " "+new Units(units, trioOrder).nameUnits();
        }
        return result;
    }

    public void putValuesInMap(HashMap map){
        map.put(TWENTY_NUMBER, TWENTY);
        map.put(THIRTY_NUMBER, THIRTY);
        map.put(FORTY_NUMBER, FORTY);
        map.put(FIFTY_NUMBER, FIFTY);
        map.put(SIXTY_NUMBER, SIXTY);
        map.put(SEVENTY_NUMBER, SEVENTY);
        map.put(EIGHTY_NUMBER, EIGHTY);
        map.put(NINETY_NUMBER, NINETY);
        }
    }

