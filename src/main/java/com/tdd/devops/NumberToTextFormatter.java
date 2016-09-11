/**
 *
 * The objective of this class is to convert Number in String format into words. The design principle is to use this class as
 * tool. The class is flexible in terms of adding more functionality. For example: Adding functionality for five digit numbers
 *
 * It's based on chain of responsibility design pattern
 * loadNumToWordMap() is used to load the number to word mapping now moved to Mapper class
 * process() is the entry point for processing.
 * convertThousandPlace() used to convert thousands and so on ...
 *
 * Currently it supports up to 99999
 * **/

package com.tdd.devops;


import java.util.HashMap;
import java.util.Map;

public class NumberToTextFormatter {

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

        return numberInWords;
    }



}
