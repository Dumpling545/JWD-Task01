package by.tc.task01.t03;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class InscribedSquareAreaTest {
    private static final double DELTA = 1e-10;
    @Test
    public void positiveAreaTest() throws NonPositiveAreaException {
        double area = 10.5;
        double expected = 5.25;
        double actual = InscribedSquareArea.getArea(area);
        assertEquals(expected, actual, DELTA);
    }
    @Test
    public void maxDoubleAreaTest() throws NonPositiveAreaException {
        double area = Double.MAX_VALUE;
        double expected = 0.8988465674311579E308;
        double actual = InscribedSquareArea.getArea(area);
        assertEquals(expected, actual, DELTA);
    }
    @Test(expected = NonPositiveAreaException.class)
    public void nonPositiveAreaTest() throws NonPositiveAreaException {
        double area = 0;
        InscribedSquareArea.getArea(area);
    }
}
