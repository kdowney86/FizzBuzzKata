/**
 * Created by kelvin on 15/05/17.
 */
public class FizzBuzz {

    public static final String FIZZ = "fizz";
    public static final String BUZZ = "buzz";

    public String getString(int number) {

        if (number % 3 == 0 && number % 5 ==0) return FIZZ + BUZZ;
        if (number % 3 == 0) return FIZZ;
        if (number % 5 == 0) return BUZZ;


        return null;
    }

}
