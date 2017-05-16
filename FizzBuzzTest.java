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

    @Test
    public void testDivFive() {
        String result = fizzBuzz.getString(5);
        Assert.assertEquals("Buzz", result);
    }

    @Test
    public void testDivThreeAndFive() {
        String result = fizzBuzz.getString(15);
        Assert.assertEquals("FizzBuzz", result);
    }

    @Test
    public void testNonDivisibleNumber() {
        int testNum = 28;
        String result = fizzBuzz.getString(testNum);
        Assert.assertEquals(Integer.toString(testNum), result);
    }

    @Test
    public void testNumberContainsThree() {
        int testNum = 31;
        String result = fizzBuzz.getString(testNum);
        Assert.assertEquals("Fizz", result);
    }

    @Test
    public void testNumberContainsFive() {
        int testNum = 52;
        String result = fizzBuzz.getString(testNum);
        Assert.assertEquals("Buzz", result);
    }
}
