import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by Marcel on 3/13/2017.
 */
public class FizzBuzzTestOne {


    @Test
    public void shouldReturnTheSameNumberIfNoOtherRequirementIsFulfilled() throws Exception{
        int givenNumber = 4;
        assertEquals(givenNumber, FizzBuzzOne.getResult(givenNumber));
    }

    @Test
    public void shouldReturnFizzIfTheNumberIsDividableBy3() throws Exception{
        int givenNumber = 9;
        assertEquals(1, FizzBuzzOne.getResult(givenNumber));
    }

    @Test
    public void shouldReturnBuzzIfTheNumberIsDividableBy5() throws Exception{
        int givenNumber = 5;
        assertEquals(2, FizzBuzzOne.getResult(givenNumber));
    }

    @Test
    public void shouldReturnFizzbuzzIfTheNumberIsDividableBy15() throws Exception{
        int givenNumber = 45;
        assertEquals(3, FizzBuzzOne.getResult(givenNumber));
    }

}
