package by.tc.task01.t05;

public class NonPositiveIntegerException extends Exception {
    public NonPositiveIntegerException() {
        super("Integer is not positive");
    }
}
