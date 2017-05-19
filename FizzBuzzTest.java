import org.junit.Assert;
import org.junit.jupiter.api.Test;
/**
 * Created by kelvin on 15/05/17.
 */
public class FizzBuzzTest {

    public static final String FIZZ = "fizz";
    public static final String BUZZ = "buzz";

    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void testThreeReturnsFizz() {
        //given
        int testNumber = 3;

        //when
        String result = fizzBuzz.getString(testNumber);

        //then
        Assert.assertEquals(FIZZ, result);
    }

    @Test
    public void testFiveReturnsBuzz() {
        //given
        int testNumber = 5;

        //when
        String result = fizzBuzz.getString(testNumber);

        //then
        Assert.assertEquals(BUZZ, result);
    }

}
