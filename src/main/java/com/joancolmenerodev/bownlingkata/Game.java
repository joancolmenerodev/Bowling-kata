package com.joancolmenerodev.bownlingkata;

public class Game {
    private int score = 0;
    private int rolls[] = new int[21];
    private int currentRoll = 0;


    public void roll(int pins) {
        score += pins;
        rolls[currentRoll++] = pins;
    }

    public int score() {
        var score = 0;
        for (var i = 0; i < rolls.length; i++)
            score += rolls[i];
        return score;
    }

}
