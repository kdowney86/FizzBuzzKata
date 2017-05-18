/**
 * Created by kelvin on 15/05/17.
 */
public class FizzBuzz {

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
        if (validate(number, 3)) result = fizzStrategy.getResult();
        if (number % 5 == 0) result = buzzStrategy.getResult();
        if (isDivisibleBy(number, 3) &&  isDivisibleBy(number, 5)) result = fizzBuzzStrategy.getResult();

        if (result.length() == 0) result = Integer.toString(number);
        return result;

    }

    private boolean validate(int number, int testNumber) {
        return isDivisibleBy(number, testNumber) || numberContains(number, testNumber);
    }

    private boolean isDivisibleBy(int number, int testNumber) {
        return number % testNumber == 0;
    }

    private boolean numberContains(int number, int testNumber) {
        return Integer.toString(number).contains(Integer.toString(testNumber));
    }
}
