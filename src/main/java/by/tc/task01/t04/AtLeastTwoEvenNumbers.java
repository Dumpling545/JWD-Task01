package by.tc.task01.t04;

public class AtLeastTwoEvenNumbers {
    public static boolean hasAtLeastTwoEven(long a, long b, long c, long d) {
        int evens = 0;
        if (a % 2 == 0)
            ++evens;
        if (b % 2 == 0)
            ++evens;
        if (c % 2 == 0)
            ++evens;
        if (d % 2 == 0)
            ++evens;
        return evens >= 2;
    }
}
