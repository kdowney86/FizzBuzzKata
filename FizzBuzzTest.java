import org.junit.Assert;
import org.junit.jupiter.api.Test;
/**
 * Created by kelvin on 15/05/17.
 */
public class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    public static final String FIZZ = "fizz";
    public static final String BUZZ = "buzz";

    @Test
    public void testReturnFizzWhenDivisibleBy3() {
        //given
        int testNumber = 3;

        //when
        String result = fizzBuzz.getString(testNumber);

        //then
        Assert.assertEquals(FIZZ, result);
    }

    @Test
    public void testReturnBuzzWhenDivisibleBy5() {
        //given
        int testNumber = 5;

        //when
        String result = fizzBuzz.getString(testNumber);

        //then
        Assert.assertEquals(BUZZ, result);
    }

    @Test
    public void testReturnFizzBuzzWhenDivisibleBy3and5() {
        //given
        int testNumber = 15;

        //when
        String result = fizzBuzz.getString(testNumber);

        //then
        Assert.assertEquals(FIZZ + BUZZ, result);
    }

    @Test
    public void testNumbersNotDivisibleBy3Or5() {
        //given
        int testNumber = 11;

        //when
        String result = fizzBuzz.getString(testNumber);

        //then
        Assert.assertEquals(Integer.toString(testNumber), result);
    }
    
    @Test
    public void testNumberContains3() {
        //given
        int testNumber = 13;

        //when
        String result = fizzBuzz.getString(testNumber);

        //then
        Assert.assertEquals(FIZZ, result);
    }

}
