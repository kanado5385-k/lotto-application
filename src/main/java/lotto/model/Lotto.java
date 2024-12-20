package lotto.model;

import java.util.List;

import lotto.utilities.RandomGenerator;
import lotto.validator.LottoValidator;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto() {
        List<Integer> numbers = RandomGenerator.lottoGenerator();
        LottoValidator.validate(numbers);
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

}
