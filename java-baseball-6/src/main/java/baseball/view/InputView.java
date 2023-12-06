package baseball.view;

import baseball.view.message.InputMessages;
import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

public class InputView {
    public static String inputNumbers() {
        System.out.print(InputMessages.INPUT_NUMBERS);
        /**
         * 고민: 비즈니스 로직과 UI 로직은 분리해야하는데, 여기서 사용자 입력받은 값을 다시 되돌려줘야 한다. 예를 들어, 매개변수로 사용자 정답 객체를 넘겨 받는 것은 번거롭다.
         * 어떻게 해야하나? inputNumbers()에서 List를 생성하고, return 하면 되지 않을까? 여기서는 입력받은 값을 넘겨주기만 하면 될 것 같다.
         */
        String input = Console.readLine();
        return input;
    }


}
