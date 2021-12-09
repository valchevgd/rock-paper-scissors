package com.valchevgd.game;

import java.util.Scanner;

public class InputReader {

    private final Scanner scanner;
    private final OutputWriter outputWriter;

    public InputReader(Scanner scanner, OutputWriter outputWriter) {
        this.scanner = scanner;
        this.outputWriter = outputWriter;
    }

    public String readPlayerChoice() {
        String playerMove;

        while (true) {
            outputWriter.promptPlayerMove();
            playerMove = scanner.nextLine();

            if (PlayerInputValidator.validatePlayerMove(playerMove)) {
                break;
            }
            outputWriter.printInvalidInputMessage(playerMove);
        }

        return playerMove;
    }

    public String readPlayAgain() {
        return scanner.nextLine();
    }
}
