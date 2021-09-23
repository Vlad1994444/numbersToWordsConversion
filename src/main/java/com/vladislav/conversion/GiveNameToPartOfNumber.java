package com.vladislav.conversion;

public class GiveNameToPartOfNumber {

    public static final String THOUSAND = "тысяча";
    public static final String THOUSAND_ANOTHER = "тысяч";
    public static final String THOUSAND_ANOTHER_ANOTHER = "тысячи";

    public static final String MILLION = "миллион";
    public static final String MILLION_ANOTHER = "миллиона";
    public static final String MILLION_ANOTHER_ANOTHER = "миллионов";

    public static final String BILLION = "триллион";
    public static final String BILLION_ANOTHER = "триллиона";
    public static final String BILLION_ANOTHER_ANOTHER = "триллионов";


    int trioOrder;
    int units;

    public GiveNameToPartOfNumber(int trioOrder, int units) {
        this.trioOrder = trioOrder;
        this.units = units;
    }

    public GiveNameToPartOfNumber(int trioOrder) {
        this.trioOrder = trioOrder;
    }

    public String giveName(){
        String result;
        switch (trioOrder){
            /*
            problem. I can not write null because it is visible in output
             */
            case 1 -> result = "";
            case 2 -> {
                if(units==1){
                    result = THOUSAND;
                }
                else if(units>=5 & units<=20 | units%10==0) {
                    result = THOUSAND_ANOTHER;
                }
                else {
                    result = THOUSAND_ANOTHER_ANOTHER;
                }
            }
            case 3 ->{
                if(units==1){
                    result = MILLION;
                }else if(units>=2 & units<=4){
                    result = MILLION_ANOTHER;
                } else{
                    result = MILLION_ANOTHER_ANOTHER;
                }
            }
            default -> result =  "";
        }
        return result;
    }

}
