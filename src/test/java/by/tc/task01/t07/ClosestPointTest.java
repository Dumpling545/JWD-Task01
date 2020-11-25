package by.tc.task01.t07;

import org.junit.Assert;
import org.junit.Test;

public class ClosestPointTest {
    @Test
    public void normalTrueValueTest() {
        float x1 = 64.5f;
        float y1 = -64.5f;
        float x2 = -64.75f;
        float y2 = -64.25f;
        boolean expected = true;
        boolean actual = ClosestPoint.isFirstCloserThanSecond(x1, y1, x2, y2);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void normalFalseValueTest() {
        float x1 = -100.5f;
        float y1 = -2.5f;
        float x2 = -2.75f;
        float y2 = -4.25f;
        boolean expected = false;
        boolean actual = ClosestPoint.isFirstCloserThanSecond(x1, y1, x2, y2);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void extremalFloatValuesTest() {
        float x1 = -Float.MIN_VALUE;
        float y1 = Float.MAX_VALUE;
        float x2 = -Float.MAX_VALUE;
        float y2 = Float.MIN_VALUE;
        boolean expected = false;
        boolean actual = ClosestPoint.isFirstCloserThanSecond(x1, y1, x2, y2);
        Assert.assertEquals(expected, actual);
    }
}
