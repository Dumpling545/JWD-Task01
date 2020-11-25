package by.tc.task01.t06;

import org.junit.Assert;
import org.junit.Test;

public class SecondsInDayToHHMMSSTest {
    @Test
    public void normalValueTest() throws IncorrectSecondsException {
        int seconds = 79635;
        int[] expecteds = {22, 7, 15};
        int[] actuals = SecondsInDayToHHMMSS.getHHMMSS(seconds);
        Assert.assertArrayEquals(expecteds, actuals);
    }
    @Test
    public void minValueTest() throws IncorrectSecondsException {
        int seconds = 1;
        int[] expecteds = {0, 0, 1};
        int[] actuals = SecondsInDayToHHMMSS.getHHMMSS(seconds);
        Assert.assertArrayEquals(expecteds, actuals);
    }
    @Test
    public void maxValueTest() throws IncorrectSecondsException {
        int seconds = 86400;
        int[] expecteds = {24, 0, 0};
        int[] actuals = SecondsInDayToHHMMSS.getHHMMSS(seconds);
        Assert.assertArrayEquals(expecteds, actuals);
    }
    @Test(expected = IncorrectSecondsException.class)
    public void incorrectValueTest() throws IncorrectSecondsException {
        int seconds = 0;
        SecondsInDayToHHMMSS.getHHMMSS(seconds);
    }
}
