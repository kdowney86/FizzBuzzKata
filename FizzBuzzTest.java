import org.junit.Assert;
import org.junit.jupiter.api.Test;
/**
 * Created by kelvin on 15/05/17.
 */
public class FizzBuzzTest {

    public static final String FIZZ = "fizz";

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

}
