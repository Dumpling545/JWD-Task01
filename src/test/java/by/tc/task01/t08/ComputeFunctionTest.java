package by.tc.task01.t08;

import org.junit.Assert;
import org.junit.Test;

public class ComputeFunctionTest {
    @Test
    public void greaterThanThreeValueTest() throws FunctionUndefinedAtPointException {
        float x = 4;
        double expected = 5;
        double actual = ComputeFunction.function(x);
        Assert.assertEquals(expected, actual, ComputeFunction.DELTA);
    }
    @Test
    public void lessThanThreeValueTest() throws FunctionUndefinedAtPointException {
        float x = 2;
        double expected = 0.5;
        double actual = ComputeFunction.function(x);
        Assert.assertEquals(expected, actual, ComputeFunction.DELTA);
    }
    @Test(expected = FunctionUndefinedAtPointException.class)
    public void functionUndefinedValueTest() throws FunctionUndefinedAtPointException {
        float x = (float) Math.pow(6.0, 1.0/3);
        ComputeFunction.function(x);
    }
}
