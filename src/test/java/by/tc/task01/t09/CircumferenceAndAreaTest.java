package by.tc.task01.t09;

import org.junit.Assert;
import org.junit.Test;

public class CircumferenceAndAreaTest {
    @Test
    public void normalValueTest() throws NonPositiveRadiusException {
        double radius = 10.125;
        double[] expecteds = {63.6172512351, 322.0623343781};
        double[] actuals = CircumferenceAndArea.getCircumferenceAndArea(radius);
        Assert.assertArrayEquals(expecteds, actuals, CircumferenceAndArea.DELTA);
    }

    @Test(expected = NonPositiveRadiusException.class)
    public void nonPositiveValueTest() throws NonPositiveRadiusException {
        double radius = -0.1;
        CircumferenceAndArea.getCircumferenceAndArea(radius);
    }
}
