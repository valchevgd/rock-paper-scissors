package com.valchevgd.game;

public class Round {

    private final Scoreboard scoreboard;
    private final OutputWriter outputWriter;

    public Round(Scoreboard scoreboard, OutputWriter outputWriter) {
        this.scoreboard = scoreboard;
        this.outputWriter = outputWriter;
    }

    public void play(String playerMove, String computerMove) {

        if (playerMove.equals(computerMove)) {

            outputWriter.printTieMessage();
        } else if (playerMove.equals("r")) {

            if (computerMove.equals("p")) {

                scoreboard.increaseComputerScore();
                outputWriter.printComputerPlayerScoreMessage();
            } else {

                scoreboard.increasePlayerScore();
                outputWriter.printPlayerScoreMessage();
            }
        } else if (playerMove.equals("p")) {

            if (computerMove.equals("s")) {

                scoreboard.increaseComputerScore();
                outputWriter.printComputerPlayerScoreMessage();
            } else {

                scoreboard.increasePlayerScore();
                outputWriter.printPlayerScoreMessage();
            }
        } else if (playerMove.equals("s")) {

            if (computerMove.equals("r")) {

                scoreboard.increaseComputerScore();
                outputWriter.printComputerPlayerScoreMessage();
            } else {

                scoreboard.increasePlayerScore();
                outputWriter.printPlayerScoreMessage();
            }
        }
    }
}
