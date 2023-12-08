package baseball.view;

import baseball.view.message.OutputMessages;
import java.util.List;

public class OutputView {

    public static void startGame() {
        System.out.println(OutputMessages.GAME_START);
    }

    public static boolean resultOfRound(List<Integer> results) {
        int correctCount = results.get(0);
        int strike = results.get(1);
        int ball = correctCount - strike;
        if (strike == 3) {
            System.out.println(strike + "스트라이크");
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            return true;
        } else if (strike != 0 && ball != 0) {
            System.out.println(ball + "볼 " + strike + "스트라이크");
        } else if (strike != 0 && ball == 0) {
            System.out.println(strike + "스트라이크");
        } else if (ball != 0) {
            System.out.println(ball + "볼");
        } else {
            System.out.println("낫싱");
        }
        return false;
    }
}
