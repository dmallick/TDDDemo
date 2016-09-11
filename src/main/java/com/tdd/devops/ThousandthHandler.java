package com.tdd.devops;


public class ThousandthHandler extends Mapper implements NumberToTextHandler {
    public String convert(String inputNumber) {
        StringBuffer wordValue = new StringBuffer();
        if ((inputNumber.length())==5){
            wordValue.append(new UnitAndTenthHandler().convert (inputNumber.substring(0,2))).append(" thousand ");
            wordValue.append(new HundredthHandler().convert (inputNumber.substring(2, 5)));
        }else {
            wordValue.append(numToWordMap.get(Integer.parseInt(inputNumber.substring(0, 1)))).append(" thousand ");
            wordValue.append(new HundredthHandler().convert(inputNumber.substring(1, 4)));
        }
        return wordValue.toString();
    }
}
