package Strategy.StrategyImpl;

import Strategy.KataStrategy;

/**
 * Created by kelvin on 19/05/17.
 */
public class FizzStrategy implements KataStrategy {


    public static final String FIZZ = "fizz";
    public static final int FIZZ_NUM = 3;

    @Override
    public String execute(int number) {
        String result = buildString(number);
        return result;
    }

    private String buildString(int number) {
        String fizzString = "";
        if (validate(number)) fizzString = FIZZ;
        return fizzString;
    }

    private boolean validate(int number) {
        return isDivisibleBy(number) || numberContains(number);
    }

    private boolean numberContains(int number) {
        return Integer.toString(number).contains(Integer.toString(FIZZ_NUM));
    }

    private boolean isDivisibleBy(int number) {
        return number % FIZZ_NUM == 0;
    }
}
