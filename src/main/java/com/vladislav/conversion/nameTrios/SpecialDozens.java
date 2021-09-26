package com.vladislav.conversion.nameTrios;

import java.util.HashMap;

import static com.vladislav.conversion.constants.Constants.*;

public class SpecialDozens {

    int specialDozens;
    int trioOrder;

    HashMap<Integer, String> fromTenToNineteen = new HashMap<>();

    public SpecialDozens(int specialDozens) {
        this.specialDozens = specialDozens;
    }

    public SpecialDozens(int specialDozens, int trioOrder) {
        this.specialDozens = specialDozens;
        this.trioOrder = trioOrder;
    }

    public String nameSpecialDozens(){
        GiveNameToPartOfNumber name = new GiveNameToPartOfNumber(trioOrder, specialDozens);
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
