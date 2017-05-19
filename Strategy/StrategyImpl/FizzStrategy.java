package Strategy.StrategyImpl;

import Strategy.KataStrategy;

/**
 * Created by kelvin on 19/05/17.
 */
public class FizzStrategy implements KataStrategy {


    public static final String FIZZ = "fizz";

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
        return number % 3 == 0 || Integer.toString(number).contains("3");
    }
}
