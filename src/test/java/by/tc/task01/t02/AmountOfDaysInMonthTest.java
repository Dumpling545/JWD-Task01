package by.tc.task01.t02;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AmountOfDaysInMonthTest {
    @Test
    public void correctNonFebruaryNonLeapYearTest()
            throws InvalidYearException, InvalidMonthException {
        long year = 1975;
        int month = 1;
        int expected = 31;
        int actual = AmountOfDaysInMonth.getDays(year, month);
        assertEquals(expected, actual);
    }

    @Test
    public void correctFebruaryNonLeapYearDivisibleBy100Test()
            throws InvalidYearException, InvalidMonthException {
        long year = 700;
        int month = 2;
        int expected = 28;
        int actual = AmountOfDaysInMonth.getDays(year, month);
        assertEquals(expected, actual);
    }

    @Test
    public void correctFebruaryNonLeapYearNotDivisibleBy100Test()
            throws InvalidYearException, InvalidMonthException {
        long year = 111754;
        int month = 2;
        int expected = 28;
        int actual = AmountOfDaysInMonth.getDays(year, month);
        assertEquals(expected, actual);
    }

    @Test
    public void correctNonFebruaryLeapYearTest()
            throws InvalidYearException, InvalidMonthException {
        long year = 12;
        int month = 6;
        int expected = 30;
        int actual = AmountOfDaysInMonth.getDays(year, month);
        assertEquals(expected, actual);
    }

    @Test
    public void correctFebruaryLeapYearDivisibleBy400Test()
            throws InvalidYearException, InvalidMonthException {
        long year = 1600;
        int month = 2;
        int expected = 29;
        int actual = AmountOfDaysInMonth.getDays(year, month);
        assertEquals(expected, actual);
    }

    @Test
    public void correctFebruaryLeapYearDivisibleBy4Test()
            throws InvalidYearException, InvalidMonthException {
        long year = 2724;
        int month = 2;
        int expected = 29;
        int actual = AmountOfDaysInMonth.getDays(year, month);
        assertEquals(expected, actual);
    }

    @Test
    public void correctMaxLongYearTest()
            throws InvalidYearException, InvalidMonthException {
        long year = Long.MAX_VALUE;
        int month = 3;
        int expected = 31;
        int actual = AmountOfDaysInMonth.getDays(year, month);
        assertEquals(expected, actual);
    }
    @Test(expected = InvalidYearException.class)
    public void incorrectNegativeYearTest()
            throws InvalidYearException, InvalidMonthException {
        long year = -400;
        int month = 2;
        AmountOfDaysInMonth.getDays(year, month);
    }
    @Test(expected = InvalidMonthException.class)
    public void incorrectMonthLessThan1Test()
            throws InvalidYearException, InvalidMonthException {
        long year = 400;
        int month = 0;
        AmountOfDaysInMonth.getDays(year, month);
    }
    @Test(expected = InvalidMonthException.class)
    public void incorrectMonthGreaterThan12Test()
            throws InvalidYearException, InvalidMonthException {
        long year = 400;
        int month = 13;
        AmountOfDaysInMonth.getDays(year, month);
    }
}
