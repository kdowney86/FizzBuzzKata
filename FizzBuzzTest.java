import org.junit.Assert;
import org.junit.jupiter.api.Test;
/**
 * Created by kelvin on 15/05/17.
 */
public class FizzBuzzTest {

    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void testDivThree() {
        String result = fizzBuzz.getString(3);
        Assert.assertEquals("Fizz", result);
    }
}
