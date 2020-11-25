package by.tc.task01.t02;

public class AmountOfDaysInMonth {
    private static int[] nonLeapYearDaysInMonth =
            new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static int monthWithLeapDay = 2;

    public static int getDays(long year, int month)
            throws InvalidYearException, InvalidMonthException {
        if (year < 0)
            throw new InvalidYearException();
        if (month < 1 || month > 12)
            throw new InvalidMonthException();
        int days = nonLeapYearDaysInMonth[month - 1];
        boolean isLeapYear = (year % 400 == 0) || (year % 100 != 0 && year % 4 == 0);
        if (isLeapYear && month == monthWithLeapDay) {
            days++;
        }
        return days;
    }
}
