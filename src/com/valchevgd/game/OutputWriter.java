package com.valchevgd.game;

public class OutputWriter {

    public void printComputerMove(String computerMove) {
        System.out.printf("Computer choose %s%n", computerMove);
    }

    public void promptPlayerMove() {
        System.out.println("Please enter your move (r, p or s)");
    }

    public void printInvalidInputMessage(String playerMove) {
        System.out.printf("%s is not a valid move.%n", playerMove);
    }

    public void printPlayerScoreMessage() {
        System.out.println("You score!");
    }

    public void printComputerPlayerScoreMessage() {
        System.out.println("Computer score!");
    }

    public void printTieMessage() {
        System.out.println("The game is tie!");
    }

    public void printScore(byte playerScore, byte computerScore) {
        System.out.printf("The score is %d:%d%n", playerScore, computerScore);
    }

    public void printPlayerWonMessage() {
        System.out.println("You win the game!");
    }

    public void printComputerWonMessage() {
        System.out.println("You lose the game...");
    }

    public void promptPlayerToPlayAgain() {
        System.out.println("Play again [Y/n]: ");
    }
}
