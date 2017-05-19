package Strategy.StrategyImpl;

import Strategy.KataStrategy;

/**
 * Created by kelvin on 19/05/17.
 */
public class FizzBuzzStrategy implements KataStrategy{

    public static final String FIZZBUZZ = "fizzbuzz";
    public static final int FIZZ_NUM = 3;
    public static final int BUZZ_NUM = 5;

    @Override
    public String execute(int number) {
        String result = buildString(number);
        return result;
    }

    private String buildString(int number) {
        String fizzBuzzString = "";
        if (validate(number)) fizzBuzzString = FIZZBUZZ;
        return fizzBuzzString;
    }

    private boolean validate(int number) {
        return number % FIZZ_NUM == 0 && number % BUZZ_NUM == 0;
    }
}
