/**
 * Created by kelvin on 15/05/17.
 */
public class FizzBuzz {

    public static final String FIZZ = "fizz";
    public static final String BUZZ = "buzz";

    public String getString(int number) {
        String result = "";

        if (number % 3 == 0) result = FIZZ;
        if (number % 5 == 0) result = BUZZ;

        return result;
    }
}
