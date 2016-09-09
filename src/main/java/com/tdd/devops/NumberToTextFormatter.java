package com.tdd.devops;


import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class NumberToTextFormatter {
    final static Logger logger = Logger.getLogger(NumberToTextFormatter.class);
    static Map<Integer, String> numToWordMap = new HashMap<Integer, String>();

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

        numToWordMap.put(30, "thirty");
        numToWordMap.put(40, "forty");
        numToWordMap.put(50, "fifty");
        numToWordMap.put(60, "sixty");
        numToWordMap.put(70, "seventy");
        numToWordMap.put(80, "eighty");
        numToWordMap.put(90, "ninty");
        numToWordMap.put(100, "hundred");
    }
}
