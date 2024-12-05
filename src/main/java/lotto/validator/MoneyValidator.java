package lotto.validator;

import lotto.enums.messages.ErrorMessage;

public class MoneyValidator {
    
    public static void validateMoney(int money) {
        if (money % 1000 != 0) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT_MONEY.getMessage());
        }
    }
}
