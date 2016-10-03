package com.tdd.checkout.ballsampling;


import com.tdd.ballsampling.BallSorter;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class BallSorterTest {

    @Test
    public void checkInstance() {
        assertNotNull(new BallSorter());
    }

    @Test
    public void sortTwoNumbers(){
        int num1 =0;
        int num2 =1;
        assertTrue(new BallSorter().sort(num1,num2)==1);
    }

}
