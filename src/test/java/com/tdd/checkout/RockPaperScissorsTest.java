package com.tdd.checkout;

import com.tdd.rockpaperscissors.RockPaperScissors;
import com.tdd.rockpaperscissors.models.Paper;
import com.tdd.rockpaperscissors.models.Scissor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


public class RockPaperScissorsTest {
    private RockPaperScissors rockPaperScissors;
    @Before
    public void setup(){
        rockPaperScissors = new RockPaperScissors();
    }

    @Test
    public void checkInstanceIsNotNull(){
        assertNotNull(rockPaperScissors);
    }

    @Test
    public void whoWinsBetweenScissorAndPaper(){
        assertTrue(rockPaperScissors.executeRP(new Scissor(), new Paper()));

    }


}
