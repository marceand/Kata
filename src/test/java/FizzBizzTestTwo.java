import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Marcel on 3/14/2017.
 */
public class FizzBizzTestTwo {
    
    
    @Test
    public void should_get_same_number_if_no_other_requirement_is_fulfilled() throws Exception{

        int number = 7;

        String expected = Integer.toString(number);
        String actual = FizzBuzzTwo.getResult(number);

        assertEquals(expected,actual);

    }


    @Test
    public void should_get_fizz_if_the_number_is_dividable_by_3() throws Exception{

        int number = 3;

        String expected = "fizz";
        String actual = FizzBuzzTwo.getResult(number);

        assertEquals(expected,actual);
    }
    
    @Test
    public void should_get_buzz_if_the_number_is_dividable_by_5() throws Exception{

        int number = 5;

        String expected = "buzz";
        String actual = FizzBuzzTwo.getResult(number);

        assertEquals(expected,actual);
    }
    
    @Test
    public void should_get_fizzbuzz_if_the_number_is_dividable_by_15() throws Exception{

        int number = 15;

        String expected = "fizzbuzz";
        String actual = FizzBuzzTwo.getResult(number);

        assertEquals(expected,actual);

    }

    @Test
    public void should_get_error_message_if_the_number_is_less_or_equal_zero() throws Exception{

        String expected = "Number must be greater than zero";
        String actual = FizzBuzzTwo.getResult(0);

        assertEquals(expected,actual);
    }
    
}
