package by.tc.task01.t02;

public class InvalidMonthException extends Exception{
    public InvalidMonthException() {
        super("Invalid month: should be in range [1, 12]");
    }
}
