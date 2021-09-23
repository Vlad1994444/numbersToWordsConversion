package com.vladislav.conversion;

import java.util.HashMap;

public class Dozens{

    private static final String TWENTY = "двадцать";
    private static final int TWENTY_NUMBER = 20;
    private static final String THIRTY = "тридцать";
    private static final int THIRTY_NUMBER = 30;
    private static final String FORTY = "сорок";
    private static final int FORTY_NUMBER = 40;
    private static final String FIFTY = "пятьдесят";
    private static final int FIFTY_NUMBER = 50;
    private static final String SIXTY = "шестьдесят";
    private static final int SIXTY_NUMBER = 60;
    private static final String SEVENTY = "семьдесят";
    private static final int SEVENTY_NUMBER = 70;
    private static final String EIGHTY = "восемдесять";
    private static final int EIGHTY_NUMBER = 80;
    private static final String NINETY = "девяносто";
    private static final int NINETY_NUMBER = 90;

    int units;
    int dozens;
    int trioOrder;

//    int [] numbers = {TEN_NUMBER, ELEVEN_NUMBER, TWELVE_NUMBER, THIRTEEN_NUMBER, TWENTY_NUMBER, THIRTY_NUMBER,FORTY_NUMBER};
//    String[] numberNames = {TEN, ELEVEN, TWELVE, THIRTEEN, TWENTY, THIRTY,FORTY};
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
            result = allDozens.get(dozens) + new Units(units, trioOrder).nameUnits();
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

