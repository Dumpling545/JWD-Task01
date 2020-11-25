package by.tc.task01.t06;

public class IncorrectSecondsException extends Exception{
    public IncorrectSecondsException(){
        super("Incorrect umber of seconds: must be in range[1, 86400]");
    }
}
