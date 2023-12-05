package baseball.controller;


import baseball.domain.Computer;
import baseball.domain.Generator;
import baseball.view.InputView;
import baseball.view.OutputView;

public class GameController {
    public static void play() {
        Computer computer = Generator.createRandomNumbers();
        OutputView.startGame();
        InputView.inputNumbers();
    }
}
