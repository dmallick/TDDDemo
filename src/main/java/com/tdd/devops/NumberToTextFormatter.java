package com.tdd.devops;


import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class NumberToTextFormatter {
    final static Logger logger = Logger.getLogger(NumberToTextFormatter.class);
    static Map<Integer, String> numToWordMap = new HashMap<Integer, String>();
    static Map<Integer, String> decimalNumToWordMap = new HashMap<Integer, String>();

    static {
        loadNumToWordMap();
    }
    public boolean validateInput(String inputData) {
        logger.info("&&&&&&&");
        boolean isInputValid = false;
        try {
            int number = Integer.parseInt(inputData);
            isInputValid = true;
        }catch (NumberFormatException e) {

        }
        return isInputValid;
    }

    public String convertTillDecimalPlace(String unitPlaceNumber) {
        int number = Integer.parseInt(unitPlaceNumber);
        return numToWordMap.get(number);
    }


    private static void loadNumToWordMap(){
        numToWordMap.put(1, "one");
        numToWordMap.put(2, "two");
        numToWordMap.put(3, "three");
        numToWordMap.put(4, "four");
        numToWordMap.put(5, "five");
        numToWordMap.put(6, "six");
        numToWordMap.put(7, "seven");
        numToWordMap.put(8, "eight");
        numToWordMap.put(9, "nine");
        numToWordMap.put(10, "ten");
        numToWordMap.put(11, "eleven");
        numToWordMap.put(12, "twelve");
        numToWordMap.put(13, "thirteen");
        numToWordMap.put(14, "fourteen");
        numToWordMap.put(15, "fifteen");
        numToWordMap.put(16, "sixteen");
        numToWordMap.put(17, "seventeen");
        numToWordMap.put(18, "eighteen");
        numToWordMap.put(19, "ninteen");
        numToWordMap.put(20, "twenty");

        decimalNumToWordMap.put(2, "twenty");
        decimalNumToWordMap.put(3, "thirty");
        decimalNumToWordMap.put(4, "forty");
        decimalNumToWordMap.put(5, "fifty");
        decimalNumToWordMap.put(6, "sixty");
        decimalNumToWordMap.put(7, "seventy");
        decimalNumToWordMap.put(8, "eighty");
        decimalNumToWordMap.put(9, "ninety");
        decimalNumToWordMap.put(10, "hundred");
    }

    public String convertTillDecimalPlaceAbove20(String unitPlaceNumber) {
        StringBuffer wordValue = new StringBuffer();
        int number = Integer.parseInt(unitPlaceNumber);
        if (number>20){
            wordValue.append(decimalNumToWordMap.get(Integer.parseInt(unitPlaceNumber.substring(0,1))))
                     .append(numToWordMap.get(Integer.parseInt(unitPlaceNumber.substring(1,2))));

        }
        return wordValue.toString();
    }
}
