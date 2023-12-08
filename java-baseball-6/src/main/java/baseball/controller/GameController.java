package baseball.controller;

import baseball.domain.Player;
import baseball.utils.Generator;
import baseball.view.InputView;
import baseball.view.OutputView;

public class GameController {
    //1.기능을 가지고 있는 클래스를 인스턴스화(=객체)한다.
    //2.필요한 기능을 (역할에 맞는) 인스턴스가 수행하게 한다.(의인화)
    //3.각 결과를 종합한다.
    public static void play() {
        OutputView.startGame();
        Player computer = Player.createAutoNumbers();
        Player user = Player.createManualNumbers(InputView.inputNumbers());
        System.out.println("computer = " + computer.getNumbers());
        System.out.println("user = " + user.getNumbers());
    }
    //User와 Computer는 사실 같으니까 하나의 클래스로 해도 될듯? 변수만 2개
    // 클래스는 속성,틀이고 , 인스턴스가 실체니까
}
