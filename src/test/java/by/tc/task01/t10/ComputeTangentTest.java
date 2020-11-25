package by.tc.task01.t10;

import java.util.HashMap;
import java.util.NavigableMap;
import java.util.SortedMap;
import org.junit.Assert;
import org.junit.Test;

public class ComputeTangentTest {
    @Test
    public void onePositiveValueTest() throws InvalidArgumentException {
        double a = Math.PI / 4;
        double b = Math.PI / 4;
        double h = 1;
        HashMap<Double, Double> expected = new HashMap<>();
        expected.put(Math.PI / 4, 1.0);
        NavigableMap<Double, Double> actual = ComputeTangent.tan(a, b, h);
        Assert.assertEquals(expected.size(), actual.size());
        for (HashMap.Entry<Double, Double> entry : expected.entrySet()) {
            double expectedKey = entry.getKey();
            SortedMap<Double, Double> subMap = actual.subMap(expectedKey - ComputeTangent.DELTA/2,
                    expectedKey + ComputeTangent.DELTA/2);
            Assert.assertEquals(subMap.size(), 1);
            Assert.assertEquals(entry.getValue(), subMap.get(subMap.firstKey()),
                    ComputeTangent.DELTA);
        }
    }

    @Test
    public void oneNegativeValueTest() throws InvalidArgumentException {
        double a = -Math.PI;
        double b = -Math.PI;
        double h = 1;
        HashMap<Double, Double> expected = new HashMap<>();
        expected.put(-Math.PI, 0.0);
        NavigableMap<Double, Double> actual = ComputeTangent.tan(a, b, h);
        Assert.assertEquals(expected.size(), actual.size());
        for (HashMap.Entry<Double, Double> entry : expected.entrySet()) {
            double expectedKey = entry.getKey();
            SortedMap<Double, Double> subMap = actual.subMap(expectedKey - ComputeTangent.DELTA/2,
                    expectedKey + ComputeTangent.DELTA/2);
            Assert.assertEquals(subMap.size(), 1);
            Assert.assertEquals(entry.getValue(), subMap.get(subMap.firstKey()),
                    ComputeTangent.DELTA);
        }
    }

    @Test
    public void manyPositiveValuesTest() throws InvalidArgumentException {
        double a = 0;
        double b = Math.PI / 3;
        double h = Math.PI / 12;
        HashMap<Double, Double> expected = new HashMap<>();
        expected.put(0.0, 0.0);
        expected.put(Math.PI / 12, 0.26794919243);
        expected.put(Math.PI / 6, 0.57735026919);
        expected.put(Math.PI / 4, 1.0);
        expected.put(Math.PI / 3, 1.73205080757);
        NavigableMap<Double, Double> actual = ComputeTangent.tan(a, b, h);
        Assert.assertEquals(expected.size(), actual.size());
        for (HashMap.Entry<Double, Double> entry : expected.entrySet()) {
            double expectedKey = entry.getKey();
            SortedMap<Double, Double> subMap = actual.subMap(expectedKey - ComputeTangent.DELTA/2,
                    expectedKey + ComputeTangent.DELTA/2);
            Assert.assertEquals(subMap.size(), 1);
            Assert.assertEquals(entry.getValue(), subMap.get(subMap.firstKey()),
                    ComputeTangent.DELTA);
        }
    }
    @Test
    public void manyMixedValuesTest() throws InvalidArgumentException {
        double a = -Math.PI / 12;
        double b = Math.PI / 12;
        double h = Math.PI / 12;
        HashMap<Double, Double> expected = new HashMap<>();
        expected.put(0.0, 0.0);
        expected.put(-Math.PI / 12, -0.26794919243);
        expected.put(Math.PI / 12, 0.26794919243);
        NavigableMap<Double, Double> actual = ComputeTangent.tan(a, b, h);
        Assert.assertEquals(expected.size(), actual.size());
        for (HashMap.Entry<Double, Double> entry : expected.entrySet()) {
            double expectedKey = entry.getKey();
            SortedMap<Double, Double> subMap = actual.subMap(expectedKey - ComputeTangent.DELTA/2,
                    expectedKey + ComputeTangent.DELTA/2);
            Assert.assertEquals(subMap.size(), 1);
            Assert.assertEquals(entry.getValue(), subMap.get(subMap.firstKey()),
                    ComputeTangent.DELTA);
        }
    }

    @Test
    public void manyNegativeValuesTest() throws InvalidArgumentException {
        double a = -Math.PI / 3;
        double b = 0;
        double h = Math.PI / 12;
        HashMap<Double, Double> expected = new HashMap<>();
        expected.put(0.0, 0.0);
        expected.put(-Math.PI / 12, -0.26794919243);
        expected.put(-Math.PI / 6, -0.57735026919);
        expected.put(-Math.PI / 4, -1.0);
        expected.put(-Math.PI / 3, -1.73205080757);
        NavigableMap<Double, Double> actual = ComputeTangent.tan(a, b, h);
        Assert.assertEquals(expected.size(), actual.size());
        for (HashMap.Entry<Double, Double> entry : expected.entrySet()) {
            double expectedKey = entry.getKey();
            SortedMap<Double, Double> subMap = actual.subMap(expectedKey - ComputeTangent.DELTA/2,
                    expectedKey + ComputeTangent.DELTA/2);
            Assert.assertEquals(subMap.size(), 1);
            Assert.assertEquals(entry.getValue(), subMap.get(subMap.firstKey()),
                    ComputeTangent.DELTA);
        }
    }

    @Test(expected = InvalidArgumentException.class)
    public void invalidRangeTest() throws InvalidArgumentException {
        double a = Math.PI;
        double b = Math.PI / 3;
        double h = Math.PI / 12;
        ComputeTangent.tan(a, b, h);
    }

    @Test(expected = InvalidArgumentException.class)
    public void invalidStepTest() throws InvalidArgumentException {
        double a = Math.PI / 3;
        double b = Math.PI;
        double h = -Math.PI / 12;
        ComputeTangent.tan(a, b, h);
    }
}
