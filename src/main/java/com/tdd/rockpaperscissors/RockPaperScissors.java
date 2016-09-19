package com.tdd.rockpaperscissors;

import com.tdd.rockpaperscissors.models.Gamer;
import com.tdd.rockpaperscissors.models.Paper;
import com.tdd.rockpaperscissors.models.Scissor;

/**
 * Created by VH68 on 9/19/2016.
 */
public class RockPaperScissors {
    public String executeRP(Gamer gamer1, Gamer gamer2) {
        int sumOfPriority = gamer1.getPriority() + gamer2.getPriority();
        return declareWinner(sumOfPriority);
    }

    private String declareWinner(int sumOfPriority) {
        return  sumOfPriority==5 ? "Scissor" : sumOfPriority==3 ? "Paper": sumOfPriority==4 ? "Rock" : "";
    }
}
