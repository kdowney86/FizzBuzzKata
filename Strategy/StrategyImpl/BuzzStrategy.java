package Strategy.StrategyImpl;

import Strategy.KataStrategy;

/**
 * Created by kelvin on 19/05/17.
 */
public class BuzzStrategy implements KataStrategy{

    public static final String BUZZ = "buzz";
    public static final int BUZZ_NUM = 5;

    @Override
    public String execute(int number) {
        String result = buildString(number);
        return result;
    }

    private String buildString(int number) {
        String buzzString = "";
        if (validate(number)) buzzString = BUZZ;
        return buzzString;
    }

    private boolean validate(int number) {
        return  number % BUZZ_NUM == 0;
    }
}
