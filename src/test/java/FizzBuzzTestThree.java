import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Marcel on 3/15/2017.
 */
public class FizzBuzzTestThree {
    
    @Test
    public void shouldReturnTheSameNumberIfNoOtherRequirementIsFulfilled() throws Exception{
        assertEquals(Integer.toString(4),FizzBuzzThree.getResult(4));
        assertEquals(Integer.toString(1),FizzBuzzThree.getResult(1));
    }
    
    @Test
    public void shouldReturnFizzIfTheNumberIsDividableBy3() throws Exception{
        assertEquals("Fizz",FizzBuzzThree.getResult(3));
        assertEquals("Fizz",FizzBuzzThree.getResult(9));
    }

    @Test
    public void shouldReturnBuzzIfTheNumberIsDividableBy5() throws Exception{
        assertEquals("Buzz",FizzBuzzThree.getResult(10));
        assertEquals("Buzz",FizzBuzzThree.getResult(5));
    }

    @Test
    public void shouldReturnFizzBuzzIfTheNumberIsDividableBy15() throws Exception{
        assertEquals("FizzBuzz",FizzBuzzThree.getResult(15));
        assertEquals("FizzBuzz",FizzBuzzThree.getResult(30));
    }

    @Test
    public void shouldReturnErrorIfTheNumberIsLessOrEqualToZero() throws Exception{
        assertEquals("Number should be greater than zero",FizzBuzzThree.getResult(0));
        assertEquals("Number should be greater than zero",FizzBuzzThree.getResult(-1));
    }
}