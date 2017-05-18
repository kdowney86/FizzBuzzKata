/**
 * Created by kelvin on 15/05/17.
 */
public class FizzBuzz {

    public static final String BUZZ = "buzz";

    KataStrategy fizzStrategy;
    KataStrategy buzzStrategy;
    KataStrategy fizzBuzzStrategy;


    public FizzBuzz() {
        fizzStrategy = new FizzStrategy();
        buzzStrategy = new BuzzStrategy();
        fizzBuzzStrategy = new FizzBuzzStrategy();
    }

    public String getString(int number) {
        String result = "";
        if (number % 3 == 0 || Integer.toString(number).contains("3")) result = fizzStrategy.getResult();
        if (number % 5 == 0) result = buzzStrategy.getResult();
        if (number % 3 == 0 &&  number % 5 == 0) result = fizzBuzzStrategy.getResult();

        if (result.length() == 0) result = Integer.toString(number);
        return result;

    }
}
