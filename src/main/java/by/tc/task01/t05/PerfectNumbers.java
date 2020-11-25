package by.tc.task01.t05;

public class PerfectNumbers {
    public static boolean isNumberPerfect(int number) throws NonPositiveIntegerException {
        if (number < 1)
            throw new NonPositiveIntegerException();
        int numberCopy = number;
        for (int i = 1; i <= number / 2 && numberCopy >= 0; i++) {
            if (number % i == 0)
            numberCopy -= i;
        }
        return numberCopy == 0;
    }
}
