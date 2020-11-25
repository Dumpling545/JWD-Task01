package by.tc.task01.t10;

public class InvalidArgumentException extends Exception {
    public InvalidArgumentException() {
        super("Incorrect argument(s): a must be equal or less than b and h must be bigger than delta");
    }
}
