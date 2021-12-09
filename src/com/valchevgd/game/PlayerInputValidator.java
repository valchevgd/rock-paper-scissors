package com.valchevgd.game;

import java.util.Arrays;

public class PlayerInputValidator {

    public static boolean validatePlayerMove(String playerChoice) {
        return Arrays.asList(GameSettings.chooses).contains(playerChoice);
    }

    public static boolean playAgain(String playAgain) {
        return playAgain.isEmpty() || playAgain.equals("Y") || playAgain.equals("y");
    }
}
