package by.tc.task01.t02;

public class InvalidYearException extends Exception{
    public InvalidYearException() {
        super("Invalid year: should be in range [0, MAX_LONG]");
    }
}
