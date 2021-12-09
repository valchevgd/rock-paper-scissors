package com.valchevgd.game;

public class Player {

    private final InputReader inputReader;

    public Player(InputReader inputReader) {
        this.inputReader = inputReader;
    }

    public String move() {
        return inputReader.readPlayerChoice();
    }
}
