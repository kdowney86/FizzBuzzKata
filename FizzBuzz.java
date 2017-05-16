/**
 * Created by kelvin on 15/05/17.
 */
public class FizzBuzz {

    public static final String FIZZ = "Fizz";

    public String getString(int number) {
        if (number % 3 == 0) return FIZZ;
        if (number % 5 == 0) return "Buzz";
        return null;
    }

}
