package baseball.view.message;

public enum OutputMessages {

    GAME_START("숫자 야구 게임을 시작합니다.");

    private String outputMessage;

    OutputMessages(String outputMessage) {
        this.outputMessage = outputMessage;
    }

    @Override
    public String toString() {
        return outputMessage;
    }
}
