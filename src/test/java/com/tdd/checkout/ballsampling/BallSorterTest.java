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
    public void sort2Numbers(){
        List<Integer> integerList = Arrays.asList(1,2);
        assertEquals(new BallSorter().compare(integerList).toString(), "[1, 2]");
    }

    @Test
    public void sort3Numbers(){
        List<Integer> integerList = Arrays.asList(1,2,3);
        assertEquals(new BallSorter().compare(integerList).toString(), "[1, 2, 3]");
    }

    @Test
    public void sort4Numbers(){
        List<Integer> integerList = Arrays.asList(999,123,876,397);
        assertEquals(new BallSorter().compare(integerList).toString(), "[123, 397, 876, 999]");
    }


    @Test
    public void sort5Numbers(){
        List<Integer> integerList = Arrays.asList(500,400,300,200,100);
        assertEquals(new BallSorter().compare(integerList).toString(), "[100, 200, 300, 400, 500]");
    }

}
