import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Marcel on 3/16/2017.
 */
public class CalcStatTest {

    int[] sequence;

    @Before
    public void setUp() throws Exception {
        sequence = new int[]{6, 9, 15, -2, 92, 11};
    }

    @Test
    public void ShouldReturnNumberOfElementsInTheSequence() throws Exception{

        assertEquals(sequence.length, CalcStats.getSequenceLength(sequence));

    }

    @Test
    public void shouldCalculateTheAverageValue() throws Exception{
        double expectedAverage = calculatedAverageValue(sequence);
        assertEquals(expectedAverage, CalcStats.calculateAverageValue(sequence),0.001);
    }

    @Test
    public void shouldFindTheMinimumValue() throws Exception{
        int expectedAverage = findMinimumValue(sequence);
        assertEquals(expectedAverage, CalcStats.findMinimumValue(sequence));
    }

    @Test
    public void shouldFindTheMaximumValue() throws Exception{
        int expectedAverage = findMaximumValue(sequence);
        assertEquals(expectedAverage, CalcStats.findMaximumValue(sequence));
    }

    private int findMaximumValue(int[] sequence) {
        return Arrays.stream(sequence).summaryStatistics().getMax();
    }

    private int findMinimumValue(int[] sequence) {
        return Arrays.stream(sequence).summaryStatistics().getMin();
    }


    private double calculatedAverageValue(int[] sequence) {
        return Arrays.stream(sequence).summaryStatistics().getAverage();
    }

}
