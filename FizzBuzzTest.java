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

    @Test
    public void testDivByThreeAndFive() {
        String result = fizzBuzz.getString(15);
        Assert.assertEquals(FIZZ + BUZZ, result);
    }

    @Test
    public void testDivByNeitherThreeNorFive() {
        //given
        int testNumber = 14;
        String expected = Integer.toString(testNumber);

        //when
        String result = fizzBuzz.getString(testNumber);

        //then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testNumberContainsThree() {
        //given
        int testNumber = 23;
        String expected = FIZZ;

        //when
        String result = fizzBuzz.getString(testNumber);

        //then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testNumberContainsFive() {
        //given
        int testNumber = 52;
        String expected = BUZZ;

        //when
        String result = fizzBuzz.getString(testNumber);

        //then
        Assert.assertEquals(expected, result);
    }
}
