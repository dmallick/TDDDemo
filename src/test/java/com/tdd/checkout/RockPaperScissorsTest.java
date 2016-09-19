package com.tdd.checkout;

import com.tdd.rockpaperscissors.RockPaperScissors;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;


public class RockPaperScissorsTest {
    @Test
    public void checkInstanceIsNotNull(){
        assertNotNull(new RockPaperScissors());
    }

    
}
