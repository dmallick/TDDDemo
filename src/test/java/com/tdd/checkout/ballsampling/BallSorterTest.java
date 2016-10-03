package com.tdd.checkout.ballsampling;


import com.tdd.ballsampling.BallSorter;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

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
        int num1 =1;
        int num2 =2;
        int num3 =3;
        //assertTrue(new BallSorter().compare(num1)==1);
    }
}
