/**
 * Created by kelvin on 15/05/17.
 */
public class FizzBuzz {

    public static final String FIZZ = "fizz";
    public static final String BUZZ = "buzz";

    public static final int FIZZ_NUMBER = 3;
    public static final int BUZZ_NUMBER = 5;

    public String getString(int number) {
        String result = "";
        if (containsOrIsDivisibleBy(number, FIZZ_NUMBER)) result += FIZZ;
        if (number % BUZZ_NUMBER == 0) result += BUZZ;

        if (result.length() == 0) result = Integer.toString(number);
        return result;
    }

    private boolean containsOrIsDivisibleBy(int number, int testNumber) {
        String numberString = Integer.toString(number);
        String testNumberString = Integer.toString(testNumber);
        return number % testNumber == 0 || numberString.contains(testNumberString);
    }

}
