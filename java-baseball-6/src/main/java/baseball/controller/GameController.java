package baseball.controller;


import baseball.domain.Computer;
import baseball.domain.Generator;
import baseball.domain.User;
import baseball.view.InputView;
import baseball.view.OutputView;

public class GameController {
    //1.기능을 가지고 있는 클래스를 인스턴스화(=객체)한다.
    //2.필요한 기능을 (역할에 맞는) 인스턴스가 수행하게 한다.(의인화)
    //3.각 결과를 종합한다.
    private static boolean state = true;

    public static void play() {
        Computer computer = new Computer(Generator.createRandomNumbers());
        OutputView.startGame();
        User user = new User(InputView.inputNumbers());
    }
}
