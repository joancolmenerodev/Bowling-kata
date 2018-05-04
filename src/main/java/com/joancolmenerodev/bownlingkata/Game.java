package com.joancolmenerodev.bownlingkata;

public class Game {
    private int rolls[] = new int[21];
    private int currentRoll = 0;


    public void roll(int pins) {
        rolls[currentRoll++] = pins;
    }

    public int score() {
        var score = 0;
        var i = 0;
        for (var frame = 0; frame < 10; frame++) {
            if (rolls[i] + rolls[i + 1] == 10) // spare
            {
                score += 10 + rolls[i + 2];
                i += 2;
            } else {
                score += rolls[i] + rolls[i + 1];
                i += 2;
            }
        }


        return score;
    }

}
