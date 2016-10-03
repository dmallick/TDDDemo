package com.tdd.ballsampling;

import java.util.List;

/**
 * Created by dmalli on 10/3/2016.
 */
public class BallSorter {
    public int compare(List<Integer> integerList) {
        int biggerNumber=0;
        int smallerNumber=0;

        for (int num: integerList){
            biggerNumber = num>biggerNumber?num:biggerNumber;
        }
        return biggerNumber;
    }
}
