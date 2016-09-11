package com.tdd.devops;


public class UnitAndTenthHandler extends Mapper implements NumberToTextHandler {

    public String convert(String inputNumber) {
        StringBuffer wordValue = new StringBuffer();
        int number = Integer.parseInt(inputNumber);
        if (number>20){
            wordValue.append(decimalNumToWordMap.get(Integer.parseInt(inputNumber.substring(0,1))))
                    .append(numToWordMap.get(Integer.parseInt(inputNumber.substring(1,2))));
        }else{
            wordValue.append(numToWordMap.get(Integer.parseInt(inputNumber)));
        }
        return wordValue.toString();
    }
}
