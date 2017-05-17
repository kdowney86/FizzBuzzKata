import org.junit.Assert;
import org.junit.jupiter.api.Test;
/**
 * Created by kelvin on 15/05/17.
 */
public class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    final String FIZZ = "fizz";
    final String BUZZ = "buzz";

    @Test
    public void testDivByThree() {
        String result = fizzBuzz.getString(3);
        Assert.assertEquals(FIZZ, result);
    }

    @Test
    public void testDivByFive() {
        String result = fizzBuzz.getString(5);
        Assert.assertEquals(BUZZ, result);
    }
}
