package com.tdd.ballsampling;

import java.util.List;

/**
 * Created by dmalli on 10/3/2016.
 */
public class BallSorter {
    public int compare(List<Integer> integerList) {
        return (integerList.get(0)>integerList.get(1)?integerList.get(0):integerList.get(1));
    }
}
