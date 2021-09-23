package com.vladislav.conversion;

import java.util.HashMap;

public class SpecialDozens {

    private static final String TEN  = "десять";
    private static final int TEN_NUMBER = 10;
    private static final String ELEVEN = "одиннадцать";
    private static final int ELEVEN_NUMBER = 11;
    private static final String TWELVE = "двенадцать";
    private static final int TWELVE_NUMBER = 12;
    private static final String THIRTEEN = "тринадцать";
    private static final int THIRTEEN_NUMBER = 13;
    private static final String FOURTEEN = "четырнадцать";
    private static final int FOURTEEN_NUMBER = 14;
    private static final String FIFTEEN = "пятнадцать";
    private static final int FIFTEEN_NUMBER = 15;
    private static final String SIXTEEN = "шестнадцать";
    private static final int SIXTEEN_NUMBER = 16;
    private static final String SEVENTEEN = "семнадцать";
    private static final int SEVENTEEN_NUMBER = 17;
    private static final String EIGHTEEN = "восемнадцать";
    private static final int EIGHTEEN_NUMBER = 18;
    private static final String NINETEEN = "девятнадцать";
    private static final int NINETEEN_NUMBER = 19;


    int specialDozens;
    int count;

    HashMap<Integer, String> fromTenToNineteen = new HashMap<>();

    public SpecialDozens(int specialDozens) {
        this.specialDozens = specialDozens;
    }

    public SpecialDozens(int specialDozens, int count) {
        this.specialDozens = specialDozens;
        this.count = count;
    }

    public String nameSpecialDozens(){
        GiveNameToPartOfNumber name = new GiveNameToPartOfNumber(count, specialDozens);
        String result;
        fullMap(fromTenToNineteen);
        result = fromTenToNineteen.get(specialDozens)+name.giveName();
        return result;
    }

    public void fullMap(HashMap map){
        map.put(TEN_NUMBER, TEN);
        map.put(ELEVEN_NUMBER, ELEVEN);
        map.put(TWELVE_NUMBER, TWELVE);
        map.put(THIRTEEN_NUMBER, THIRTEEN);
        map.put(FOURTEEN_NUMBER, FOURTEEN);
        map.put(FIFTEEN_NUMBER, FIFTEEN);
        map.put(SIXTEEN_NUMBER, SIXTEEN);
        map.put(SEVENTEEN_NUMBER, SEVENTEEN);
        map.put(EIGHTEEN_NUMBER, EIGHTEEN);
        map.put(NINETEEN_NUMBER, NINETEEN);
    }
}
