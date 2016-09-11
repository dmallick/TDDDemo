package com.tdd.devops;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by VH68 on 9/11/2016.
 */
public class Mapper {

    static Map<Integer, String> numToWordMap;
    static Map<Integer, String> decimalNumToWordMap;

    static {
        decimalNumToWordMap = new HashMap<Integer, String>();
        numToWordMap = new HashMap<Integer, String>();
        loadNumToWordMap();

    }


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

}
