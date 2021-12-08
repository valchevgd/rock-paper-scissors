package com.valchevgd;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final String[] rps = {"r", "p", "s"};
    private static final Scanner scanner = new Scanner(System.in);
    private static byte playerScore;
    private static byte computerScore;

    public static void main(String[] args) {
        play();
        scanner.close();
    }

    private static void play() {
        while (true) {
            String playerMove;

            while (true) {
                System.out.println("Please enter your move (r, p or s)");
                playerMove = scanner.nextLine();

                if (Arrays.asList(rps).contains(playerMove)) {
                    break;
                }

                System.out.printf("%s is not a valid move.%n", playerMove);
            }

            String computerMove = rps[new Random().nextInt(rps.length)];

            System.out.printf("Computer choose %s%n", computerMove);

            if (playerMove.equals(computerMove)) {
                System.out.println("The game is tie!");
            } else if (playerMove.equals("r")) {
                if (computerMove.equals("p")) {
                    computerScore++;
                    System.out.println("You lose...");
                } else {
                    playerScore++;
                    System.out.println("You win!");
                }
            } else if (playerMove.equals("p")) {
                if (computerMove.equals("s")) {
                    computerScore++;
                    System.out.println("You lose...");
                } else {
                    playerScore++;
                    System.out.println("You win!");
                }
            } else if (playerMove.equals("s")) {
                if (computerMove.equals("r")) {
                    computerScore++;
                    System.out.println("You lose...");
                } else {
                    playerScore++;
                    System.out.println("You win!");
                }
            }

            System.out.printf("The score is %d:%d%n", playerScore, computerScore);

            if (playerScore == 3 || computerScore == 3) {
                if (playerScore == 3) {
                    System.out.println("You win the game!");
                } else {
                    System.out.println("You lose the game...");
                }

                break;
            }
        }
    }
}
