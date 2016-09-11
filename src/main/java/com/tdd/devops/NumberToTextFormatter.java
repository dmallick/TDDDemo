/**
 *
 * The objective of this class is to convert Number in String format into words. The design principle is to use this class as
 * tool. The class is flexible in terms of adding more functionality. For example: Adding functionality for five digit numbers
 *
 * It's based on chain of responsibility design pattern
 * loadNumToWordMap() is used to load the number to word mapping
 * process() is the entry point for processing.
 * convertThousandPlace() used to convert thousands and so on ...
 *
 * Currently it supports up to 99999
 * **/

package com.tdd.devops;


import java.util.HashMap;
import java.util.Map;

public class NumberToTextFormatter {

    private static Map<Integer, String> numToWordMap;
    private static Map<Integer, String> decimalNumToWordMap;

    static {
        decimalNumToWordMap = new HashMap<Integer, String>();
        numToWordMap = new HashMap<Integer, String>();
        loadNumToWordMap();

    }
    public boolean validateInput(String inputData) {
        boolean isInputValid = false;
        try {
            Integer.parseInt(inputData);
            isInputValid = true;
        }catch (NumberFormatException e) {

        }
        return isInputValid;
    }

    public String process(String inputData){
        Map<Integer, NumberToTextHandler> commandMap = new HashMap();
        commandMap.put(1, new UnitAndTenthHandler());
        commandMap.put(2, new UnitAndTenthHandler());
        commandMap.put(3, new HundredthHandler());
        commandMap.put(4, new ThousandthHandler());
        commandMap.put(5, new ThousandthHandler());
        String numberInWords = commandMap.get(inputData.length()).convert(inputData);

        /*switch (inputData.length()) {
            case 5 :
                numberInWords = convertThousandPlace(inputData);
                break;
            case 4:
                numberInWords = convertThousandPlace(inputData);
                break;
            case 3:
                numberInWords = convertHundredPlace(inputData);
                break;
            case 2:
                numberInWords = convertUnitAndDecimalPlace(inputData);
                break;
            case 1:
                numberInWords = convertUnitAndDecimalPlace(inputData);
                break;
        }*/
        return numberInWords;
    }

/*
    public String convertUnitAndDecimalPlace(String unitPlaceNumber) {
        int number = Integer.parseInt(unitPlaceNumber);
        return numToWordMap.get(number);
    }
*/


    private static void loadNumToWordMap(){
        numToWordMap.put(0, "");
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
        numToWordMap.put(19, "nineteen");
        numToWordMap.put(20, "twenty");

        decimalNumToWordMap.put(0, "");
        decimalNumToWordMap.put(2, "twenty ");
        decimalNumToWordMap.put(3, "thirty ");
        decimalNumToWordMap.put(4, "forty ");
        decimalNumToWordMap.put(5, "fifty ");
        decimalNumToWordMap.put(6, "sixty ");
        decimalNumToWordMap.put(7, "seventy ");
        decimalNumToWordMap.put(8, "eighty ");
        decimalNumToWordMap.put(9, "ninety ");
        decimalNumToWordMap.put(10, "hundred ");
    }

    // Convert decimal number and below
    public String convertUnitAndDecimalPlace(String inputNumber) {
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
    // Convert hundredth number and below
    public String convertHundredPlace(String inputNumber) {
        StringBuffer wordValue = new StringBuffer();
        int hundredthPositionValue = Integer.parseInt(inputNumber.substring(0,1));
        if (hundredthPositionValue!=0) {
            wordValue.append(numToWordMap.get(Integer.parseInt(inputNumber.substring(0, 1)))).append(" hundred ");
        }
        wordValue.append(convertUnitAndDecimalPlace(inputNumber.substring(1, 3)));
        return wordValue.toString();
    }

    // Convert thousandth number and below
    public String convertThousandPlace(String inputNumber) {
        StringBuffer wordValue = new StringBuffer();
        if ((inputNumber.length())==5){
            wordValue.append(convertUnitAndDecimalPlace(inputNumber.substring(0,2))).append(" thousand ");
            wordValue.append(convertHundredPlace(inputNumber.substring(2, 5)));
        }else {
            wordValue.append(numToWordMap.get(Integer.parseInt(inputNumber.substring(0, 1)))).append(" thousand ");
            wordValue.append(convertHundredPlace(inputNumber.substring(1, 4)));
        }
        return wordValue.toString();
    }
}
