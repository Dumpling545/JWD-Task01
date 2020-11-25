package by.tc.task01.t06;

public class SecondsInDayToHHMMSS {
    private static final int MIN_SECONDS = 1;
    private static final int MAX_SECONDS = 86400;

    public static int[] getHHMMSS(int seconds) throws IncorrectSecondsException {
        if (seconds < MIN_SECONDS || seconds > MAX_SECONDS)
            throw new IncorrectSecondsException();
        int secondsInMinute = seconds % 60;
        int minutes = seconds / 60;
        int minutesInHour = minutes % 60;
        int hours = minutes / 60;
        int hhmmss[] = {hours, minutesInHour, secondsInMinute};
        return hhmmss;
    }
}
