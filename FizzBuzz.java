/**
 * Created by kelvin on 15/05/17.
 */
public class FizzBuzz {

    public static final String FIZZ = "fizz";

    public String getString(int number) {
        if (number % 5 == 0) return "buzz";
        return FIZZ;
    }
}
