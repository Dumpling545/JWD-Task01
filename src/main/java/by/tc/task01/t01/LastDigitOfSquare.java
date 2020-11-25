package by.tc.task01.t01;

public class LastDigitOfSquare {
    private static long radix = 10;
    public static long solve(long x) {
        long lastDigit = x % radix;
        return (lastDigit * lastDigit) % radix;
    }
}
