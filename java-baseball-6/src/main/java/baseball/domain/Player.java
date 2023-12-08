package baseball.domain;

import baseball.utils.Generator;
import baseball.utils.Validator;
import baseball.view.InputView;
import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Integer> numbers;

    public Player(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public static Player createAutoNumbers() {
        return new Player(Generator.createRandomNumbers());
    }

    public static Player createManualNumbers(String input) {
        try {
            Validator.isValidateInput(input);
            return new Player(convertToList(input));
        } catch (Exception e) {
            throw new IllegalArgumentException("[ERROR] 입력값이 유효하지 않습니다.");
        }
    }

    private static List<Integer> convertToList(String input) {
        List<Integer> numbers = new ArrayList<>();
        for (String number : input.split("")) {
            numbers.add(Integer.valueOf(number));
        }
        return numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
