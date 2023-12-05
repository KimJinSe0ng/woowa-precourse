package baseball.view.message;

public enum InputMessages {
    INPUT_NUMBERS("숫자를 입력해주세요 : ");

    private String inputMMessage;

    InputMessages(String inputMMessage) {
        this.inputMMessage = inputMMessage;
    }

    @Override
    public String toString() {
        return inputMMessage;
    }
}
