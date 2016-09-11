package com.tdd.devops;


public class HundredthHandler extends Mapper implements NumberToTextHandler {
    public String convert(String inputNumber) {
        StringBuffer wordValue = new StringBuffer();
        int hundredthPositionValue = Integer.parseInt(inputNumber.substring(0,1));
        if (hundredthPositionValue!=0) {
            wordValue.append(numToWordMap.get(Integer.parseInt(inputNumber.substring(0, 1)))).append(" hundred ");
        }
        wordValue.append(new UnitAndTenthHandler().convert(inputNumber.substring(1, 3)));
        return wordValue.toString();
    }
}
