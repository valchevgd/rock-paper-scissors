package com.valchevgd.game;

import java.util.Scanner;

public class Game {

    private final OutputWriter outputWriter;
    private final InputReader inputReader;
    private final Scoreboard scoreboard;
    private final Round round;
    private boolean gameIsOver = false;

    public Game() {
        outputWriter = new OutputWriter();
        inputReader = new InputReader(new Scanner(System.in), outputWriter);
        scoreboard = new Scoreboard();
        round = new Round(scoreboard, outputWriter);
    }

    public void play() {

        Player player = new Player(inputReader);
        ComputerPlayer computerPlayer = new ComputerPlayer();

        while (! gameIsOver) {
            String playerMove = player.move();

            String computerMove = computerPlayer.move();

            outputWriter.printComputerMove(computerMove);

            round.play(playerMove, computerMove);

            outputWriter.printScore(scoreboard.getPlayerScore(), scoreboard.getComputerScore());

            checkGameOver();
        }
    }

    private void checkGameOver() {

        if (scoreboard.getPlayerScore() == 3 || scoreboard.getComputerScore() == 3) {
            if (scoreboard.getPlayerScore() == 3) {
                outputWriter.printPlayerWonMessage();
            } else {
                outputWriter.printComputerWonMessage();
            }

            showPlayAgainMenu();
        }
    }

    private void showPlayAgainMenu() {
        outputWriter.promptPlayerToPlayAgain();

        if (PlayerInputValidator.playAgain(inputReader.readPlayAgain())) {
            scoreboard.resetScore();
            outputWriter.printScore(scoreboard.getPlayerScore(), scoreboard.getComputerScore());
        } else {
            gameIsOver = true;
        }
    }
}
