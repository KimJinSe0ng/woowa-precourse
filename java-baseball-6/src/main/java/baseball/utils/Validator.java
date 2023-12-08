package baseball.utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

public class Validator {

    public static void isValidateInput(String input) {
        isDuplicate(input);
        isInRange(input);
        isString(input);
    }
    public static void isDuplicate(String input) {
        Set<Character> digits = new HashSet<>();

        for (char number : input.toCharArray()) {
            if (!digits.add(number)) {
                throw new IllegalArgumentException("[ERROR] 숫자는 서로 달라야 합니다.");
            }
        }
    }
    public static void isString(String input) {
        String regExp = "^[\\D]*$";
        if (Pattern.matches(regExp, input)) {
            throw new IllegalArgumentException("[ERROR] 문자는 입력할 수 없습니다.");
        }
    }

    public static void isInRange(String input) {
        if (input.length() < 1 || input.length() > 3) {
            throw new IllegalArgumentException("[ERROR] 3개의 값만 입력받을 수 있습니다.");
        }
    }
}

