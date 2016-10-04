package com.tdd.checkout.ballsampling;


import com.tdd.ballsampling.BallSorter;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class BallSorterTest {

    @Test
    public void checkInstance() {
        assertNotNull(new BallSorter());
    }

    @Test
    public void returnBiggerNumberFrom2Numbers(){
        List<Integer> integerList = Arrays.asList(1,2);
        assertTrue(new BallSorter().compare(integerList)==2);
    }

    @Test
    public void returnBiggerNumberFrom3Numbers(){
        List<Integer> integerList = Arrays.asList(1,2,3);
        assertEquals(new BallSorter().compare(integerList), 3);
    }

    @Test
    public void returnBiggerNumberFrom4Numbers(){
        List<Integer> integerList = Arrays.asList(999,123,876,397);
        assertEquals(new BallSorter().compare(integerList), 999);
    }

    @Test
    public void printSortedNumbers(){
        List<Integer> integerList = Arrays.asList(999,123,876,397);
        new BallSorter().compare(integerList);
    }
}
