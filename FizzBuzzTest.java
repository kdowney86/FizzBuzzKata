import org.junit.Assert;
import org.junit.jupiter.api.Test;
/**
 * Created by kelvin on 15/05/17.
 */
public class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    public static final String FIZZ = "fizz";

    @Test
    public void testReturnFizzWhenDivisibleBy3() {
        //given
        int testNumber = 3;

        //when
        String result = fizzBuzz.getString(testNumber);

        //then
        Assert.assertEquals(FIZZ, result);
    }
}
