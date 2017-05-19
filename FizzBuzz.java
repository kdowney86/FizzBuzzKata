/**
 * Created by kelvin on 15/05/17.
 */
public class FizzBuzz {

    public static final String FIZZ = "fizz";

    public String getString(int number) {
        String result = "";

        if (number % 3 == 0) result = FIZZ;

        return result;
    }
}
