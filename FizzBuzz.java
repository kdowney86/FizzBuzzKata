import java.util.HashMap;

/**
 * Created by kelvin on 15/05/17.
 */
public class FizzBuzz {

    public static final String FIZZ = "fizz";
    public static final String BUZZ = "buzz";

    public static final int FIZZ_NUMBER = 3;
    public static final int BUZZ_NUMBER = 5;

    private HashMap<Integer, String> fizzBuzzMap;

    public FizzBuzz() {
        fizzBuzzMap = new HashMap<>();
        fizzBuzzMap.put(FIZZ_NUMBER, FIZZ);
        fizzBuzzMap.put(BUZZ_NUMBER, BUZZ);
    }

    public String getString(int number) {
        String result = "";
        result += buildString(number, FIZZ_NUMBER);
        result += buildString(number, BUZZ_NUMBER);

        result = fillStringIfEmpty(number, result);
        return result;
    }

    private boolean containsOrIsDivisibleBy(int number, int testNumber) {
        String numberString = Integer.toString(number);
        String testNumberString = Integer.toString(testNumber);
        return number % testNumber == 0 || numberString.contains(testNumberString);
    }

    private String buildString(int number, int testNumber) {
        String result = "";
        if (containsOrIsDivisibleBy(number, testNumber)) result = fizzBuzzMap.get(testNumber);
        return result;
    }

    private String fillStringIfEmpty(int number, String result) {
        if (result.length() == 0) result = Integer.toString(number);
        return result;
    }
}
