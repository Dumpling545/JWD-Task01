package by.tc.task01.t01;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LastDigitOfSquareTest {
    @Test
    public void zeroParameterTest() {
        long x = 0;
        long expected = 0;
        long actual = LastDigitOfSquare.solve(x);
        assertEquals(expected, actual);
    }

    @Test
    public void positiveParameterTest() {
        long x = 1000000000000000226l;
        long expected = 6;
        long actual = LastDigitOfSquare.solve(x);
        assertEquals(expected, actual);
    }

    @Test
    public void negativeParameterTest() {
        long x = -987220202020331l;
        long expected = 1;
        long actual = LastDigitOfSquare.solve(x);
        assertEquals(expected, actual);
    }

    @Test
    public void maxLongParameterTest() {
        long x = Long.MAX_VALUE;
        long expected = 9;
        long actual = LastDigitOfSquare.solve(x);
        assertEquals(expected, actual);
    }

    @Test
    public void minLongParameterTest() {
        long x = Long.MIN_VALUE;
        long expected = 4;
        long actual = LastDigitOfSquare.solve(x);
        assertEquals(expected, actual);
    }
}
