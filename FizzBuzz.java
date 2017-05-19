import Strategy.KataStrategy;
import Strategy.StrategyImpl.BuzzStrategy;
import Strategy.StrategyImpl.FizzBuzzStrategy;
import Strategy.StrategyImpl.FizzStrategy;

import java.util.ArrayList;

/**
 * Created by kelvin on 15/05/17.
 */
public class FizzBuzz {

    ArrayList<KataStrategy> strategies;

    public FizzBuzz() {
        strategies = new ArrayList<>();
        strategies.add(new FizzBuzzStrategy());
        strategies.add(new FizzStrategy());
        strategies.add(new BuzzStrategy());
    }

    public String getString(int number) {
        String result = buildResponseString(number);
        return result;
    }

    public String buildResponseString(int number) {
        String responseString = "";
        for (int i = 0; i < strategies.size(); i++) {
            responseString = strategies.get(i).execute(number);
            if (responseString.length() > 0) break;
        }

        if (responseString.length() == 0) responseString = Integer.toString(number);

        return responseString;
    }
}
