package baseball.view;

import baseball.utils.Validator;
import baseball.view.message.InputMessages;
import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public static String inputNumbers() {
        System.out.print(InputMessages.INPUT_NUMBERS);
        String input = Console.readLine();
        return input;
    }

    public static boolean isPlaying() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String input = Console.readLine();
        try {
            Validator.isNumberInRange(input);
            Validator.isString(input);
            if (input.equals("1")) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("[ERROR]");
        }
    }
}
