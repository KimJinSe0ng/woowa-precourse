package baseball.domain;

import baseball.utils.Generator;
import baseball.utils.Validator;
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
            throw new IllegalArgumentException();
        }
    }

    private static List<Integer> convertToList(String input) {
        List<Integer> numbers = new ArrayList<>();
        for (String number : input.split("")) {
            numbers.add(Integer.valueOf(number));
        }
        return numbers;
    }

    public List<Integer> compare(Player other) {
        List<Integer> results = new ArrayList<>();
        int correctCount = 0;
        int strike = 0;
        for (int i = 0; i < other.numbers.size(); i++) {
            int computerNumber = this.numbers.get(i);
            int userNumber = other.numbers.get(i);
            if (this.numbers.contains(userNumber)) {
                correctCount++;
            }
            if (computerNumber == userNumber) {
                strike++;
            }
        }
        results.add(correctCount);
        results.add(strike);
        return results;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
