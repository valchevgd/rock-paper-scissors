package com.valchevgd.game;

public class Scoreboard {

    private byte playerScore;
    private byte computerScore;

    public void increasePlayerScore() {
        playerScore++;
    }

    public void increaseComputerScore() {
        computerScore++;
    }

    public byte getPlayerScore() {
        return playerScore;
    }

    public byte getComputerScore() {
        return computerScore;
    }

    public void resetScore() {
        playerScore = 0;
        computerScore = 0;
    }
}
