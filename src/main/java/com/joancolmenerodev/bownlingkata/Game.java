package com.joancolmenerodev.bownlingkata;

public class Game {
    private int rolls[] = new int[21];
    private int currentRoll = 0;


    public void roll(int pins) {
        rolls[currentRoll++] = pins;
    }

    public int score() {
        var score = 0;
        for (int roll : rolls) score += roll;
        return score;
    }

}
