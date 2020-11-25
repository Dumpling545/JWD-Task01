package by.tc.task01.t05;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PerfectNumbersTest {
    @Test
    public void perfectNumberTest() throws NonPositiveIntegerException {
        int number = 33550336;
        boolean expected = true;
        boolean actual = PerfectNumbers.isNumberPerfect(number);
        assertEquals(expected, actual);
    }
    @Test
    public void nonPerfectNumberTest() throws NonPositiveIntegerException {
        int number = 33550335;
        boolean expected = false;
        boolean actual = PerfectNumbers.isNumberPerfect(number);
        assertEquals(expected, actual);
    }
    @Test
    public void maxIntegerTest() throws NonPositiveIntegerException {
        int number = Integer.MAX_VALUE;
        boolean expected = false;
        boolean actual = PerfectNumbers.isNumberPerfect(number);
        assertEquals(expected, actual);
    }
    @Test(expected = NonPositiveIntegerException.class)
    public void nonPositiveNumberTest() throws NonPositiveIntegerException {
        int number = 0;
        PerfectNumbers.isNumberPerfect(number);
    }
}
