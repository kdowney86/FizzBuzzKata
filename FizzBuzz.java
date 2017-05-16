/**
 * Created by kelvin on 15/05/17.
 */
public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public String getString(int number) {
        String result = "";
        if (containsOrIsDivisibleBy(number, 3)) {
            result += FIZZ;
        }
        if (number % 5 == 0) {
            result += BUZZ;
        }
        if (result.length() == 0) result = Integer.toString(number);
        return result;
    }

    private boolean containsOrIsDivisibleBy(int number, int testNum) {
        String testString = Integer.toString(testNum);
        return number % 3 == 0 || Integer.toString(number).contains(testString);
    }

}
