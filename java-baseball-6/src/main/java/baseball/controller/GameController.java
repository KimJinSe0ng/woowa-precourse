package baseball.controller;


import baseball.domain.Computer;
import baseball.domain.Generator;

public class GameController {
    public static void play() {
       Computer computer = Generator.createRandomNumbers();
    }
}
