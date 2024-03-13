package blackjack.domain.money;

import java.util.regex.Pattern;

public class Money {
    private static final String NOT_NUMERIC = "숫자 형식이 아닙니다.";
    private static final String NON_NEGATIVE_ERROR = "배팅할 금액을 음수일 수 없습니다.";
    private final int value;

    private Money(int value) {
        validatePositive(value);
        this.value = value;
    }

    public static Money from(String money) {
        validateNumericString(money);
        return new Money(Integer.parseInt(money));
    }

    private static void validateNumericString(String money) {
        if (!Pattern.compile("-?\\d+").matcher(money).matches()) {
            throw new IllegalArgumentException(NOT_NUMERIC);
        }
    }

    private static void validatePositive(int money) {
        if (money < 0) {
            throw new IllegalArgumentException(NON_NEGATIVE_ERROR);
        }
    }

    public int get() {
        return value;
    }
}