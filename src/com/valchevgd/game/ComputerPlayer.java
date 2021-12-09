package com.valchevgd.game;

import java.util.Random;

public class ComputerPlayer {

    public String move() {
        return GameSettings.chooses[new Random().nextInt(GameSettings.chooses.length)];
    }
}
