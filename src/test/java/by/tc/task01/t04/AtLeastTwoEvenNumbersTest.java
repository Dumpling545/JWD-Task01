package by.tc.task01.t04;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AtLeastTwoEvenNumbersTest {
    @Test
    public void AllNumbersAreOddTest() {
        long a = -11111;
        long b = 333145;
        long c = 10000000000009l;
        long d = -11;
        boolean expected = false;
        boolean actual = AtLeastTwoEvenNumbers.hasAtLeastTwoEven(a, b, c, d);
        assertEquals(expected, actual);
    }
    @Test
    public void OneEvenNumberTest() {
        long a = 123;
        long b = 9;
        long c = -12;
        long d = 99999999999l;
        boolean expected = false;
        boolean actual = AtLeastTwoEvenNumbers.hasAtLeastTwoEven(a, b, c, d);
        assertEquals(expected, actual);
    }
    @Test
    public void TwoEvenNumberTest() {
        long a = -1;
        long b = 23;
        long c = 12;
        long d = -5555959592l;
        boolean expected = true;
        boolean actual = AtLeastTwoEvenNumbers.hasAtLeastTwoEven(a, b, c, d);
        assertEquals(expected, actual);
    }
    @Test
    public void ThreeEvenNumberTest() {
        long a = -1020201;
        long b = 22222222222222222l;
        long c = -9191910;
        long d = -90;
        boolean expected = true;
        boolean actual = AtLeastTwoEvenNumbers.hasAtLeastTwoEven(a, b, c, d);
        assertEquals(expected, actual);
    }
    @Test
    public void AllNumbersAreEvenTest() {
        long a = 0;
        long b = 220;
        long c = -12;
        long d = 12020236572l;
        boolean expected = true;
        boolean actual = AtLeastTwoEvenNumbers.hasAtLeastTwoEven(a, b, c, d);
        assertEquals(expected, actual);
    }
}
