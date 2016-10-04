package com.tdd.ballsampling;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by dmalli on 10/3/2016.
 */
public class BallSorter {

    List<Integer> sortedList;// = new ArrayList();
    int previousSmallerNumber=0;
    public int compare(List<Integer> integerList) {
        sortedList = new ArrayList();
        boolean shouldIterate = false;
        int biggerNumber = integerList.get(0);
        int smallerNumber = 0;

        for (int i=1; i<integerList.size(); i++){
            int num = integerList.get(i);
            int temp = biggerNumber;
            biggerNumber = num<biggerNumber?biggerNumber:num;
            smallerNumber = num>temp?temp:num;
            if (smallerNumber<previousSmallerNumber) {
                previousSmallerNumber = smallerNumber;
                shouldIterate = true;
            }
            addNumberToList(smallerNumber);
            previousSmallerNumber = smallerNumber;
        }
        addNumberToList(biggerNumber);
        if (shouldIterate) {
            List<Integer> tempList = sortedList;
            integerList = new ArrayList();
            compare(tempList);
        }
        return biggerNumber;
    }

    private void addNumberToList(int smallerNumber) {
        sortedList.add(smallerNumber);
        System.out.println(sortedList);
    }


}
